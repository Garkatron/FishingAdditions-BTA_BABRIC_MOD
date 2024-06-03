package dev.deus.fishing_additions.Items;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class FishingAdditionsItems {
	public static Item gold_fishing_rod_item;

	public void Initialize() {
		gold_fishing_rod_item = ItemHelper.createItem(MOD_ID, new ItemGoldFishingRod("GoldFishingRod", config.newItemID()), "gold_fishing_rod.png");

	}

}

