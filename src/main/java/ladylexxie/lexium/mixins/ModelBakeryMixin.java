package ladylexxie.lexium.mixins;

import java.io.IOException;

import ladylexxie.lexium.hooks.UnlitQuadHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.resources.ResourceLocation;

@Mixin( ModelBakery.class )
public class ModelBakeryMixin {
	@Inject( method = "loadModel", at = @At( "HEAD" ), allow = 1 )
	protected void onBeginLoadModel( ResourceLocation location, CallbackInfo cri ) throws IOException {
		UnlitQuadHooks.beginDeserializingModel(location);
	}

	@Inject( method = "loadModel", at = @At( "RETURN" ) )
	protected void onEndLoadModel( ResourceLocation location, CallbackInfo cri ) {
		UnlitQuadHooks.endDeserializingModel();
	}
}
