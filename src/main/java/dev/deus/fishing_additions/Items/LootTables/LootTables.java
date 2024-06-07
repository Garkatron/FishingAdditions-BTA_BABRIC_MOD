package dev.deus.fishing_additions.Items.LootTables;

import dev.deus.fishing_additions.LootTable;
import net.minecraft.core.item.Item;

import static dev.deus.fishing_additions.Items.FishingAdditionsItems.*;

public class LootTables {
	public static LootTable GoldFishingRodLootTable = new LootTable(
		new Item[]{
			pufferfish,
			salmon,
			tropical_fish,
			gold_fish,
			Item.foodFishRaw
		});
	public static LootTable IronFishingRodLootTable = new LootTable(
		new Item[]{
			pufferfish,
			salmon,
			tropical_fish,
			Item.foodFishRaw
		});
	public static LootTable SteelFishingRodLootTable = new LootTable(
		new Item[]{
			pufferfish,
			salmon,
			tropical_fish,
			Item.foodFishRaw
		});
	public static LootTable VanilaFishingRodLootTable = new LootTable(
		new Item[]{
			pufferfish,
			salmon,
			tropical_fish,
			Item.foodFishRaw
		});

}
