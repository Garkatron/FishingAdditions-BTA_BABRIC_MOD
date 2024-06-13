package dev.deus.fishing_additions.LootTables;

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
		GoldFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 6);            // 6% Pufferfish normal
		GoldFishingRodLootTable.addItemWithProbability(5, pufferfish_medium, 0, 4);      // 4% Pufferfish mediano
		GoldFishingRodLootTable.addItemWithProbability(5, pufferfish_large, 0, 4);       // 4% Pufferfish grande
		GoldFishingRodLootTable.addItemWithProbability(25, salmon, 0, 12);               // 12% Salmon normal
		GoldFishingRodLootTable.addItemWithProbability(10, salmon_medium, 0, 8);         // 8% Salmon mediano
		GoldFishingRodLootTable.addItemWithProbability(10, salmon_large, 0, 8);          // 8% Salmon grande
		GoldFishingRodLootTable.addItemWithProbability(20, Item.foodFishRaw, 0, 6);      // 6% Pescado crudo
		GoldFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 24);         // 24% Pez tropical normal
		GoldFishingRodLootTable.addItemWithProbability(1, tropical_fish_medium, 0, 16);  // 16% Pez tropical mediano
		GoldFishingRodLootTable.addItemWithProbability(1, tropical_fish_large, 0, 16);   // 16% Pez tropical grande

		IronFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 6);            // 6% Pufferfish normal
		IronFishingRodLootTable.addItemWithProbability(5, pufferfish_medium, 0, 4);      // 4% Pufferfish mediano
		IronFishingRodLootTable.addItemWithProbability(5, pufferfish_large, 0, 4);       // 4% Pufferfish grande
		IronFishingRodLootTable.addItemWithProbability(25, salmon, 0, 12);               // 12% Salmon normal
		IronFishingRodLootTable.addItemWithProbability(10, salmon_medium, 0, 8);         // 8% Salmon mediano
		IronFishingRodLootTable.addItemWithProbability(10, salmon_large, 0, 8);          // 8% Salmon grande
		IronFishingRodLootTable.addItemWithProbability(20, Item.foodFishRaw, 0, 6);      // 6% Pescado crudo
		IronFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 24);         // 24% Pez tropical normal
		IronFishingRodLootTable.addItemWithProbability(1, tropical_fish_medium, 0, 16);  // 16% Pez tropical mediano
		IronFishingRodLootTable.addItemWithProbability(1, tropical_fish_large, 0, 16);   // 16% Pez tropical grande

		SteelFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 6);            // 6% Pufferfish normal
		SteelFishingRodLootTable.addItemWithProbability(5, pufferfish_medium, 0, 4);      // 4% Pufferfish mediano
		SteelFishingRodLootTable.addItemWithProbability(5, pufferfish_large, 0, 4);       // 4% Pufferfish grande
		SteelFishingRodLootTable.addItemWithProbability(25, salmon, 0, 12);               // 12% Salmon normal
		SteelFishingRodLootTable.addItemWithProbability(10, salmon_medium, 0, 8);         // 8% Salmon mediano
		SteelFishingRodLootTable.addItemWithProbability(10, salmon_large, 0, 8);          // 8% Salmon grande
		SteelFishingRodLootTable.addItemWithProbability(20, Item.foodFishRaw, 0, 6);      // 6% Pescado crudo
		SteelFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 24);         // 24% Pez tropical normal
		SteelFishingRodLootTable.addItemWithProbability(1, tropical_fish_medium, 0, 16);  // 16% Pez tropical mediano
		SteelFishingRodLootTable.addItemWithProbability(1, tropical_fish_large, 0, 16);   // 16% Pez tropical grande

		VanilaFishingRodLootTable.addItemWithProbability(13, pufferfish, 0, 6);            // 6% Pufferfish normal
		VanilaFishingRodLootTable.addItemWithProbability(5, pufferfish_medium, 0, 4);      // 4% Pufferfish mediano
		VanilaFishingRodLootTable.addItemWithProbability(5, pufferfish_large, 0, 4);       // 4% Pufferfish grande
		VanilaFishingRodLootTable.addItemWithProbability(25, salmon, 0, 12);               // 12% Salmon normal
		VanilaFishingRodLootTable.addItemWithProbability(10, salmon_medium, 0, 8);         // 8% Salmon mediano
		VanilaFishingRodLootTable.addItemWithProbability(10, salmon_large, 0, 8);          // 8% Salmon grande
		VanilaFishingRodLootTable.addItemWithProbability(20, Item.foodFishRaw, 0, 6);      // 6% Pescado crudo
		VanilaFishingRodLootTable.addItemWithProbability(2, tropical_fish, 0, 24);         // 24% Pez tropical normal
		VanilaFishingRodLootTable.addItemWithProbability(1, tropical_fish_medium, 0, 16);  // 16% Pez tropical mediano
		VanilaFishingRodLootTable.addItemWithProbability(1, tropical_fish_large, 0, 16);   // 16% Pez tropical grande

		FishingNetBlockLootTable.addItemWithProbability(13, pufferfish, 0, 6);            // 6% Pufferfish normal
		FishingNetBlockLootTable.addItemWithProbability(5, pufferfish_medium, 0, 4);      // 4% Pufferfish mediano
		FishingNetBlockLootTable.addItemWithProbability(5, pufferfish_large, 0, 4);       // 4% Pufferfish grande
		FishingNetBlockLootTable.addItemWithProbability(25, salmon, 0, 12);               // 12% Salmon normal
		FishingNetBlockLootTable.addItemWithProbability(10, salmon_medium, 0, 8);         // 8% Salmon mediano
		FishingNetBlockLootTable.addItemWithProbability(10, salmon_large, 0, 8);          // 8% Salmon grande
		FishingNetBlockLootTable.addItemWithProbability(20, Item.foodFishRaw, 0, 6);      // 6% Pescado crudo
		FishingNetBlockLootTable.addItemWithProbability(2, tropical_fish, 0, 24);         // 24% Pez tropical normal
		FishingNetBlockLootTable.addItemWithProbability(1, tropical_fish_medium, 0, 16);  // 16% Pez tropical mediano
		FishingNetBlockLootTable.addItemWithProbability(1, tropical_fish_large, 0, 16);   // 16% Pez tropical grande

	}




}
