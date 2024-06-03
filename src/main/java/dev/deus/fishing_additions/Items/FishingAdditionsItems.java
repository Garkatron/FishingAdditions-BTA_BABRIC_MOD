package dev.deus.fishing_additions.Items;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ItemHelper;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {
	public static Item gold_fishing_rod_item;

	public void Initialize() {
		//MOD_ID, new ItemGoldFishingRod("GoldFishingRod", config.newItemID()), ,"gold_fishing_rod.png"
		gold_fishing_rod_item = new ItemBuilder(MOD_ID)
			.build(new ItemGoldFishingRod("gold_fishing_rod", config.newItemID()));
	}

}

