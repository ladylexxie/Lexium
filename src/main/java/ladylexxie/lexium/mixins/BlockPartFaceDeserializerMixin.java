package ladylexxie.lexium.mixins;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

import ladylexxie.lexium.hooks.UnlitQuadHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.renderer.block.model.BlockElementFace;
import net.minecraft.client.renderer.block.model.BlockElementFace.Deserializer;

@Mixin( Deserializer.class )
public class BlockPartFaceDeserializerMixin {
	@Inject( method = "deserialize", at = @At( "RETURN" ), cancellable = true, allow = 1, remap = false )
	public void onDeserialize( JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext, CallbackInfoReturnable<BlockElementFace> cri ) {
		if( !UnlitQuadHooks.isUnlitExtensionEnabled() ) return;

		BlockElementFace modelElement = cri.getReturnValue();
		cri.setReturnValue(UnlitQuadHooks.enhanceModelElementFace(modelElement, jsonElement));
	}
}
