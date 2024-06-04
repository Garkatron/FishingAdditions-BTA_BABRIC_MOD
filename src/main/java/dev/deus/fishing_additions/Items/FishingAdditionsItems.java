package dev.deus.fishing_additions.Items;

import dev.deus.fishing_additions.Items.ItemModel.HydraScale;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {

	// Fishing Rod
	public static Item gold_fishing_rod_item;
	public static Item iron_fishing_rod_item;
	public static Item steel_fishing_rod_item;

	// Ingredients
	public static Item HydraScale;


	public void Initialize() {
		//MOD_ID, new ItemGoldFishingRod("GoldFishingRod", config.newItemID()), ,"gold_fishing_rod.png"
		gold_fishing_rod_item = new ItemBuilder(MOD_ID)
			.build(new ItemGoldFishingRod("gold_fishing_rod", config.newItemID()));

		iron_fishing_rod_item = new ItemBuilder(MOD_ID)
			.build(new ItemIronFishingRod("iron_fishing_rod", config.newItemID()));

		steel_fishing_rod_item = new ItemBuilder(MOD_ID)
			.build(new ItemSteelFishingRod("steel_fishing_rod", config.newItemID()));

		HydraScale = new ItemBuilder(MOD_ID)
			.build(new HydraScale("hydra_scale", config.newItemID()));

	}

}

