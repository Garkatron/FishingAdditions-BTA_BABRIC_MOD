package dev.deus.fishing_additions.Recipes;

import dev.deus.fishing_additions.DevTools.Debug.Debug;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeBuilder;

import static dev.deus.fishing_additions.Blocks.BlockInitializer.fishing_net_block;
import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.Items.FishingAdditionsItems.*;

public class RecipeInitializer {
	public void Initialize() {

		Debug.println("INITIALIZING RECIPES");

		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HAH", "HHH")
			.addInput('H', Item.ingotIron)
			.addInput('A', Item.foodFishRaw)
			.create("FishingNetBlockCrafting", fishing_net_block.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  H",
				" HS",
				"H S")
			.addInput('H', Item.ingotGold)
			.addInput('S', Item.string)
			.create("GoldFishingRodCrafting", gold_fishing_rod_item.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  H",
				" HS",
				"H S")
			.addInput('H', Item.ingotIron)
			.addInput('S', Item.string)
			.create("IronFishingRodCrafting", iron_fishing_rod_item.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"  H",
				" HS",
				"H S")
			.addInput('H', Item.ingotSteel)
			.addInput('S', Item.string)
			.create("SteelFishingRodCrafting", steel_fishing_rod_item.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" F ", "KFJ", " W ")
			.addInput('W', Item.bowl)
			.addInput('F', Item.foodFishCooked)
			.addInput('K', cooked_salmon)
			.addInput('J', cooked_cod)

			.create("CookedFishSoupCrafting", cooked_fish_soup.getDefaultStack());

		// FURNACE
		RecipeBuilder.Furnace(MOD_ID).setInput(salmon).create("CookedSalmonRecipe",cooked_salmon.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(gold_fish).create("CookedGoldFishRecipe",cooked_gold_fish.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(cod_fish).create("CookedCodFishRecipe",cooked_cod.getDefaultStack());

		RecipeBuilder.Furnace(MOD_ID).setInput(salmon).create("CookedSalmonRecipe", cooked_salmon.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(salmon_medium).create("CookedMediumSalmonRecipe", cooked_salmon_medium.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(salmon_large).create("CookedLargeSalmonRecipe", cooked_salmon_large.getDefaultStack());

		RecipeBuilder.Furnace(MOD_ID).setInput(cod_fish).create("CookedCodFishRecipe", cooked_cod.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(cod_fish_medium).create("CookedMediumCodFishRecipe", cooked_cod_medium.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(cod_fish_large).create("CookedLargeCodFishRecipe", cooked_cod_large.getDefaultStack());

		RecipeBuilder.Furnace(MOD_ID).setInput(gold_fish).create("CookedGoldfishRecipe", cooked_gold_fish.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(gold_fish_medium).create("CookedMediumGoldfishRecipe", cooked_gold_fish_medium.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID).setInput(gold_fish_large).create("CookedLargeGoldfishRecipe", cooked_gold_fish_large.getDefaultStack());








	}
}
