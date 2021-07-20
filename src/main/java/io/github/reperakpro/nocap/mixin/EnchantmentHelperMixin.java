package io.github.reperakpro.nocap.mixin;

import io.github.reperakpro.nocap.NoCap;
import net.minecraft.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @ModifyArg(method = "getLevelFromNbt", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(III)I"), index = 2)
    private static int injectMaxEnchantmentLevel(int x) {
        return NoCap.getMaxEnchantmentLevel();
    }
}
