package dev.deus.fishing_additions.Recipes;

import dev.deus.fishing_additions.Tools.Debug.Debug;
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
		// RecipeBuilder.Furnace(MOD_ID).setInput().create("CookedSalmonRecipe",salmon.getDefaultStack());
		// RecipeBuilder.Furnace(MOD_ID).setInput(salmon).create("CookedSalmonRecipe",salmon.getDefaultStack());







	}
}
