package ladylexxie.lexium.data;

import com.google.common.collect.ImmutableSet;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.FunctionUserBuilder;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Stream;

public class LexiumBlocksLootTables extends LootTableProvider {
	private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
	private static final LootItemCondition.Builder HAS_NO_SILK_TOUCH = HAS_SILK_TOUCH.invert();
	private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(LexiumBlocks.LEXIUM_ORE.get()).map(ItemLike::asItem).collect(ImmutableSet.toImmutableSet());

	@Override
	public @NotNull String getName() {
		return "Lexium Loot Tables";
	}

	public LexiumBlocksLootTables( DataGenerator dataGenerator ) {
		super(dataGenerator);
	}

	protected static <T> T applyExplosionDecay( ItemLike itemLike, FunctionUserBuilder<T> p_124133_ ) {
		return (T) (!EXPLOSION_RESISTANT.contains(itemLike.asItem()) ? p_124133_.apply(ApplyExplosionDecay.explosionDecay()) : p_124133_.unwrap());
	}

	protected static LootTable.Builder createOreDrop( Block block, Item item ) {
		return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(block).when(HAS_NO_SILK_TOUCH).otherwise(applyExplosionDecay(block, LootItem.lootTableItem(item)))));
	}
}
