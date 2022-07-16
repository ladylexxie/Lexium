package ladylexxie.lexium.items.tiers;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum LexiumArmorMaterials implements ArmorMaterial {
	LEXIUM("lexium", 15, new int[]{ 2, 3, 5, 3 }, 21, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0.0f, () -> {
		return Ingredient.of(LexiumItems.LEXIUM_INGOT.get());
	});

	private static final int[] HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredient;

	LexiumArmorMaterials( String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient ) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = Lazy.of(repairIngredient);
	}

	public int getDurabilityForSlot( EquipmentSlot pSlot ) {
		return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot( EquipmentSlot pSlot ) {
		return this.slotProtections[pSlot.getIndex()];
	}

	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	public @NotNull SoundEvent getEquipSound() {
		return this.sound;
	}

	public @NotNull Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	public @NotNull String getName() {
		return Lexium.MOD_NAME + ":" + this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
