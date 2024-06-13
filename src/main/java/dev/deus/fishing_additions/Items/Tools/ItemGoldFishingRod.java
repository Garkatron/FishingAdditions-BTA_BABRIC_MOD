package dev.deus.fishing_additions.Items.Tools;

import dev.deus.fishing_additions.Items.CustomClasses.CustomItemFishingRod;

public class ItemGoldFishingRod extends CustomItemFishingRod {


	public ItemGoldFishingRod(String name, int id) {
		super(name, id);
		this.setMaxDamage(128);
		this.setMaxStackSize(1);
		//this.setLootTable(GoldFishingRodLootTable);

	}



}
