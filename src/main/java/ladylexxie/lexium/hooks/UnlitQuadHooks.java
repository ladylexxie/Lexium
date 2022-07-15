/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2021, TeamAppliedEnergistics, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package ladylexxie.lexium.hooks;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormatElement.Type;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.mixins.BakedQuadAccessor;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockElementFace;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;

public class UnlitQuadHooks {
	private static final int LIGHT_OFFSET = getLightOffset();
	private static final int UNLIT_LIGHT_UV = LightTexture.pack(15, 15);
	private static final ThreadLocal<Boolean> ENABLE_UNLIT_EXTENSIONS = new ThreadLocal<>();

	public static void beginDeserializingModel( ResourceLocation location ) {
		String namespace = location.getNamespace();
		if( namespace.equals(Lexium.MOD_ID) ) {
			ENABLE_UNLIT_EXTENSIONS.set(true);
		}
	}

	public static void endDeserializingModel() {
		ENABLE_UNLIT_EXTENSIONS.set(false);
	}

	public static boolean isUnlitExtensionEnabled() {
		Boolean b = ENABLE_UNLIT_EXTENSIONS.get();
		return b != null && b;
	}

	public static BlockElementFace enhanceModelElementFace( BlockElementFace modelElement, JsonElement jsonElement ) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if( GsonHelper.getAsBoolean(jsonObject, "unlit", false) ) {
			return new UnlitBlockPartFace(modelElement.cullForDirection, modelElement.tintIndex, modelElement.texture, modelElement.uv);
		}
		return modelElement;
	}

	public static BakedQuad makeUnlit( BakedQuad quad ) {
		int[] vertexData = quad.getVertices().clone();
		int stride = DefaultVertexFormat.BLOCK.getIntegerSize();
		for( int i = 0; i < 4; i++ ) {
			vertexData[stride * i + LIGHT_OFFSET] = UNLIT_LIGHT_UV;
		}
		TextureAtlasSprite sprite = ((BakedQuadAccessor) quad).getSprite();
		return new BakedQuad(vertexData, quad.getTintIndex(), quad.getDirection(), sprite, false);
	}

	public static class UnlitBlockPartFace extends BlockElementFace {
		public UnlitBlockPartFace( Direction cullFaceIn, int tintIndexIn, String textureIn, BlockFaceUV blockFaceUVIn ) {
			super(cullFaceIn, tintIndexIn, textureIn, blockFaceUVIn);
		}
	}

	private static int getLightOffset() {
		VertexFormat format = DefaultVertexFormat.BLOCK;
		int offset = 0;
		for( VertexFormatElement element : format.getElements() ) {
			if( element == DefaultVertexFormat.ELEMENT_UV2 ) {
				if( element.getType() != Type.SHORT )
					throw new UnsupportedOperationException("Expected light map format to be of type SHORT");
				if( offset % 4 != 0 )
					throw new UnsupportedOperationException("Expected light map offset to be 4-byte aligned");
				return offset / 4;
			}
			offset += element.getByteSize();
		}
		throw new UnsupportedOperationException("Failed to find the lightmap index in the block vertex format");
	}
}
