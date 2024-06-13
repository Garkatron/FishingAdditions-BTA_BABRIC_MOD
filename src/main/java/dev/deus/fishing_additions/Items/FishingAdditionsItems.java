package dev.deus.fishing_additions.Items;


import deus.rarity_lib.Interfaces.mixin.IItemRarityMixin;
import deus.rarity_lib.RarityLevel;
import dev.deus.fishing_additions.DevTools.Debug.Debug;
import dev.deus.fishing_additions.DevTools.Utils.ItemSettings;
import dev.deus.fishing_additions.DevTools.Utils.ItemType;
import dev.deus.fishing_additions.DevTools.Utils.ItemUtils;
import dev.deus.fishing_additions.Items.Tools.ItemCreativeFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemGoldFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemIronFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemSteelFishingRod;
import dev.deus.fishing_additions.LootTables.LootTables;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;

import static dev.deus.fishing_additions.DevTools.Utils.ItemUtils.*;
import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {

	// Generic Builders

	public static final ItemBuilder GenericItemBuilder = new ItemBuilder(MOD_ID);

	// ### Pescado Pufferfish
	public static ItemFood pufferfish;
	public static ItemFood pufferfish_medium;
	public static ItemFood pufferfish_large;

	// ### Salmón
	public static ItemFood salmon;
	public static ItemFood salmon_medium;
	public static ItemFood salmon_large;
	public static ItemFood cooked_salmon;
	public static ItemFood cooked_salmon_medium;
	public static ItemFood cooked_salmon_large;

	// ### Pez Tropical
	public static ItemFood tropical_fish;
	public static ItemFood tropical_fish_medium;
	public static ItemFood tropical_fish_large;

	// ### Bacalao
	public static ItemFood cod_fish;
	public static ItemFood cod_fish_medium;
	public static ItemFood cod_fish_large;
	public static ItemFood cooked_cod;
	public static ItemFood cooked_cod_medium;
	public static ItemFood cooked_cod_large;

	// ### Pez Dorado (Goldfish)
	public static ItemFood gold_fish;
	public static ItemFood gold_fish_medium;
	public static ItemFood gold_fish_large;
	public static ItemFood cooked_gold_fish;
	public static ItemFood cooked_gold_fish_medium;
	public static ItemFood cooked_gold_fish_large;

	// ### Sopa de Pescado Cocido
	public static ItemFood cooked_fish_soup;

	// ? ## Tools
	public static Item gold_fishing_rod_item;
	public static Item iron_fishing_rod_item;
	public static Item steel_fishing_rod_item;


	// ? ## Ingredients
	public static Item hydra_scale;

	public void Initialize() {

		double healing_factor = config.getDouble("food.sized.healing_factor");
		int base_healing = config.getInt("food.sized.base_healing");

		// * # Items

		// ? ## Food
// Original items
		pufferfish = makeSizedFood(config.newItemID(), "pufferfish", 300, 5, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		tropical_fish = makeSizedFood(config.newItemID(), "tropical_fish", 150, 2, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		salmon = makeSizedFood(config.newItemID(), "salmon", 1500, 6, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_salmon = makeSizedFood(config.newItemID(), "salmon.cooked", 1500, 12, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		cod_fish = makeSizedFood(config.newItemID(), "cod", 2000, 6, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_cod = makeSizedFood(config.newItemID(), "cod.cooked", 2000, 12, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		gold_fish = makeSizedFood(config.newItemID(), "gold_fish", 200, 7, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);
		cooked_gold_fish = makeSizedFood(config.newItemID(), "gold_fish.cooked", 250, 10, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);

// Medium size variants
		pufferfish_medium = makeSizedFood(config.newItemID(), "pufferfish.medium", 350, 6, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		tropical_fish_medium = makeSizedFood(config.newItemID(), "tropical_fish.medium", 175, 3, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		salmon_medium = makeSizedFood(config.newItemID(), "salmon.medium", 1700, 7, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_salmon_medium = makeSizedFood(config.newItemID(), "salmon.cooked.medium", 1700, 14, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		cod_fish_medium = makeSizedFood(config.newItemID(), "cod.medium", 2200, 7, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_cod_medium = makeSizedFood(config.newItemID(), "cod.cooked.medium", 2200, 14, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		gold_fish_medium = makeSizedFood(config.newItemID(), "gold_fish.medium", 250, 8, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);
		cooked_gold_fish_medium = makeSizedFood(config.newItemID(), "gold_fish.cooked.medium", 300, 11, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);

// Large size variants
		pufferfish_large = makeSizedFood(config.newItemID(), "pufferfish.large", 400, 7, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		tropical_fish_large = makeSizedFood(config.newItemID(), "tropical_fish.large", 200, 4, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		salmon_large = makeSizedFood(config.newItemID(), "salmon.large", 1900, 8, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_salmon_large = makeSizedFood(config.newItemID(), "salmon.cooked.large", 1900, 16, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		cod_fish_large = makeSizedFood(config.newItemID(), "cod.large", 2400, 8, healing_factor, base_healing, false, 64, RarityLevel.COMMON);
		cooked_cod_large = makeSizedFood(config.newItemID(), "cod.cooked.large", 2400, 16, healing_factor, base_healing, false, 64, RarityLevel.COMMON);

		gold_fish_large = makeSizedFood(config.newItemID(), "gold_fish.large", 300, 9, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);
		cooked_gold_fish_large = makeSizedFood(config.newItemID(), "gold_fish.cooked.large", 350, 12, healing_factor, base_healing, false, 64, RarityLevel.UNCOMMON);

		cooked_fish_soup = makeFood(config.newItemID(), "cooked_fish_soup", 16, 23, false, 64, RarityLevel.COMMON);

		// ? ## Loot tables
		// Wait to create items until after you've created the loot tables, then create the things that use them.
		LootTables.initializeLootTables();

		// ? ## Tools
		gold_fishing_rod_item = makeItem(new ItemGoldFishingRod("fishing_rod.gold", config.newItemID()), RarityLevel.COMMON);
		iron_fishing_rod_item = makeItem(new ItemIronFishingRod("fishing_rod.iron", config.newItemID()), RarityLevel.COMMON);
		steel_fishing_rod_item = makeItem(new ItemSteelFishingRod("fishing_rod.steel", config.newItemID()), RarityLevel.COMMON);

		// ? ## Ingredients
		hydra_scale = genericMakeItem(new ItemSettings(ItemType.ITEM, config.newItemID(), "hydra_scale"));

		Debug.debugExecuteIt(() -> {

			Item creative_fishing_rod;
			ItemBuilder generic_item_builder = new ItemBuilder(MOD_ID);

			ItemCreativeFishingRod t = new ItemCreativeFishingRod("creative_fishing_rod", config.newItemID());
			t.setLootTable(LootTables.VanilaFishingRodLootTable);
			creative_fishing_rod = generic_item_builder.build(t);
			CreativeHelper.setPriority(creative_fishing_rod, 1000);

			IItemRarityMixin mixinItem = creative_fishing_rod;
			mixinItem.rarityLib$setRarityLevel(RarityLevel.COMMON);

			Debug.println("Creative: " + creative_fishing_rod.id);

		});

		// Here are assigned the priorities of the items in the creative menu.
		ItemUtils.assignPriorities(this.getClass());

	}


}

