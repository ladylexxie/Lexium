package ladylexxie.lexium.items.tiers;

import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum LexiumTier implements Tier {
	LEXIUM(5, 4096, 12.0f, 5.0f, 20, () -> {
		return Ingredient.of(LexiumItems.LEXIUM_INGOT.get());
	});

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	LexiumTier( int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient ) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}

	@Override
	public int getUses() {
		return uses;
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return damage;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public @NotNull Ingredient getRepairIngredient() {
		return repairIngredient.get();
	}
}
