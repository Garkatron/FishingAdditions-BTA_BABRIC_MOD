package dev.deus.testmod;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeBuilder;

import static dev.deus.testmod.BlockInitializer.fishing_net_block;
import static dev.deus.testmod.FishingAdditions.MOD_ID;

public class RecipeInitializer {
	public void Initialize() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HAH", "HHH")
			.addInput('H', Item.ingotIron)
			.addInput('A', Item.foodFishRaw)
			.create("FishingNetBlockCrafting", fishing_net_block.getDefaultStack());
	}
}
