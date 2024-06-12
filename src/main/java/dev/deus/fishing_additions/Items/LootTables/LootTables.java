package dev.deus.fishing_additions.Items.LootTables;

import deus.rarity_lib.LootTables.LootTable;
import net.minecraft.core.item.Item;

import java.util.HashMap;

import static dev.deus.fishing_additions.Items.FishingAdditionsItems.*;

public class LootTables {
	public static LootTable GoldFishingRodLootTable =
		new LootTable(new HashMap<>());
	public static LootTable IronFishingRodLootTable  =
		new LootTable(new HashMap<>());
	public static LootTable SteelFishingRodLootTable  =
		new LootTable(new HashMap<>());
	public static LootTable VanilaFishingRodLootTable  =
		new LootTable(new HashMap<>());

	public static LootTable FishingNetBlockLootTable  =
		new LootTable(new HashMap<>());


	public static void initializeLootTables(){
		GoldFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 1);
		GoldFishingRodLootTable.addItemWithProbability(25, salmon, 0, 2);
		GoldFishingRodLootTable.addItemWithProbability(60, Item.foodFishRaw, 0, 1);
		GoldFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 4);

		IronFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 1);
		IronFishingRodLootTable.addItemWithProbability(25, salmon, 0, 2);
		IronFishingRodLootTable.addItemWithProbability(60, Item.foodFishRaw, 0, 1);
		IronFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 4);

		SteelFishingRodLootTable.addItemWithProbability(16,pufferfish,0,1);
		SteelFishingRodLootTable.addItemWithProbability(20,salmon,0,2);
		SteelFishingRodLootTable.addItemWithProbability(50,Item.foodFishRaw,0,1);
		SteelFishingRodLootTable.addItemWithProbability(14,tropical_fish,0,4);

		VanilaFishingRodLootTable.addItemWithProbability(13, pufferfish, 10, 20);
		VanilaFishingRodLootTable.addItemWithProbability(25, salmon, 1, 2);
		VanilaFishingRodLootTable.addItemWithProbability(60, Item.foodFishRaw, 1, 1);
		VanilaFishingRodLootTable.addItemWithProbability(2, tropical_fish, 1, 1);

		FishingNetBlockLootTable.addItemWithProbability(13, pufferfish, 0, 1);
		FishingNetBlockLootTable.addItemWithProbability(25, salmon, 0, 2);
		FishingNetBlockLootTable.addItemWithProbability(60, Item.foodFishRaw, 0, 1);
		FishingNetBlockLootTable.addItemWithProbability(2, tropical_fish, 0, 4);

	}




}
