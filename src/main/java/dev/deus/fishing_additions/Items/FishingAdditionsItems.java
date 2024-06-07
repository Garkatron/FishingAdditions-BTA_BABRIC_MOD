package dev.deus.fishing_additions.Items;

import dev.deus.fishing_additions.Items.Ingredients.HydraScale;
import dev.deus.fishing_additions.Items.Tools.ItemGoldFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemIronFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemSteelFishingRod;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {

	//
	public static ItemFood pufferfish;
	public static ItemFood salmon;
	public static ItemFood tropical_fish;
	public static ItemFood cod_fish;

	// Fishing Rod
	public static Item gold_fishing_rod_item;
	public static Item iron_fishing_rod_item;
	public static Item steel_fishing_rod_item;



	public static ItemFood cooked_salmon;
	public static ItemFood cooked_cod;
	public static ItemFood gold_fish;
	public static ItemFood cooked_gold_fish;

	public static ItemFood cooked_fish_soup;

	// Ingredients
	public static Item HydraScale;


	public void Initialize() {

		//
		pufferfish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"pufferfish",
				config.newItemID(),
				1, // Valor de saturación para pufferfish
				2, // Valor de curación para pufferfish
				false,
				64
			));

		salmon = new ItemBuilder(MOD_ID)
			.build(new ItemFood("salmon", config.newItemID(),
				3, // Valor de saturación para salmon
				6, // Valor de curación para salmon
				false,
				64
			));

		tropical_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"tropical_fish", config.newItemID(),
				2, // Valor de saturación para tropical_fish
				4, // Valor de curación para tropical_fish
				false,
				64
			));
		cod_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cod_fish", config.newItemID(),
				2, // Valor de saturación para cod_fish
				4, // Valor de curación para cod_fish
				false,
				64
			));

		cooked_salmon = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_salmon", config.newItemID(),
				8, // Valor de saturación para cooked_salmon
				10, // Valor de curación para cooked_salmon
				false,
				64
			));

		cooked_cod = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_cod",
				config.newItemID(),
				7, // Valor de saturación para cooked_cod
				9, // Valor de curación para cooked_cod
				false,
				64
			));


		gold_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"gold_fish",
				config.newItemID(),
				6, // Valor de saturación para gold_fish
				8, // Valor de curación para gold_fish
				false,
				64
			));

		cooked_gold_fish = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_gold_fish",
				config.newItemID(),
				10, // Valor de saturación para cooked_gold_fish
				12, // Valor de curación para cooked_gold_fish
				false,
				64
			));

		cooked_fish_soup = new ItemBuilder(MOD_ID)
			.build(new ItemFood(
				"cooked_fish_soup",
				config.newItemID(),
				16, // Valor de saturación para cooked_gold_fish
				16, // Valor de curación para cooked_gold_fish
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


		// here
		assignPriorities();

	}
	// Bucle para asignar prioridades a todas las variables estáticas
	public void assignPriorities() {
		// Variables estáticas de tipo Item y ItemFood
		Item[] items = { pufferfish, salmon, tropical_fish, cod_fish, cooked_salmon, cooked_cod, gold_fish, cooked_gold_fish, cooked_fish_soup, gold_fishing_rod_item, iron_fishing_rod_item, steel_fishing_rod_item, HydraScale };

		for (Item item : items) {
			CreativeHelper.setPriority(item, 1000);
		}
	}


}

