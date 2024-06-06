package dev.deus.fishing_additions.Items;

import dev.deus.fishing_additions.Items.Ingredients.HydraScale;
import dev.deus.fishing_additions.Items.Tools.ItemGoldFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemIronFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemSteelFishingRod;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.ItemBuilder;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {

	//
	public static ItemFood pufferfish;
	public static ItemFood salmon;
	public static ItemFood tropical_fish;

	// Fishing Rod
	public static Item gold_fishing_rod_item;
	public static Item iron_fishing_rod_item;
	public static Item steel_fishing_rod_item;



	public static ItemFood cooked_salmon;
	public static ItemFood cooked_cod;
	public static ItemFood gold_fish;
	public static ItemFood cooked_gold_fish;

	// Ingredients
	public static Item HydraScale;


	public void Initialize() {

		//
		pufferfish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"pufferfish",
				config.newItemID(),
				1,
				2,
				false,
				64
			));

		salmon = new ItemBuilder(MOD_ID)
			.build(new ItemFood("salmon", config.newItemID(),
				2, // Valor de saturación para salmon
				4, // Valor de curación para salmon
				false,
				64
			));

		tropical_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"tropical_fish", config.newItemID(),
				1,
				3,
				false,
				64
			));

		cooked_salmon = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_salmon", config.newItemID(),
				6,
				8,
				false,
				64
			));

		cooked_cod = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_cod",
				config.newItemID(),
				5,
				7,
				false,
				64
			));


		gold_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"gold_fish",
				config.newItemID(),
				5,
				7,
				false,
				64
			));

		cooked_gold_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_gold_fish",
				config.newItemID(),
				5,
				7,
				false,
				64
			));

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

