package dev.deus.fishing_additions;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeBuilder;

import static dev.deus.fishing_additions.Blocks.BlockInitializer.fishing_net_block;
import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.gold_fishing_rod_item;

public class RecipeInitializer {
	public void Initialize() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HAH", "HHH")
			.addInput('H', Item.ingotIron)
			.addInput('A', Item.foodFishRaw)
			.create("FishingNetBlockCrafting", fishing_net_block.getDefaultStack());

		RecipeBuilder.Shaped(MOD_ID)
			.setShape("H  ", " H ", "  H")
			.addInput('H', Item.ingotIron)
			.create("GoldFishingRodCrafting", gold_fishing_rod_item.getDefaultStack());
	}
}
