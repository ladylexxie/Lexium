package ladylexxie.lexium.mixins;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockElement;
import net.minecraft.client.renderer.block.model.BlockElementFace;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelState;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin( BlockModel.class )
public class BlockModelMixin {
	@Inject( method = "bakeFace", at = @At( "RETURN" ), cancellable = true, require = 1, allow = 1 )
	private static void onBakeFace( BlockElement partIn, BlockElementFace partFaceIn, TextureAtlasSprite spriteIn, Direction directionIn, ModelState transformIn, ResourceLocation locationIn, CallbackInfoReturnable<BakedQuad> cri ) {
		if( partFaceIn instanceof UnlitQuadHooks.UnlitBlockPartFace ) {
			cri.setReturnValue(UnlitQuadHooks.makeUnlit(cri.getReturnValue()));
		}
	}
}