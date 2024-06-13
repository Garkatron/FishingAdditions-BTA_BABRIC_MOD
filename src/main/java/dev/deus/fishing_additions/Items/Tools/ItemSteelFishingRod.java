package dev.deus.fishing_additions.Items.Tools;

import dev.deus.fishing_additions.Items.CustomClasses.CustomItemFishingRod;

//import static dev.deus.fishing_additions.LootTables.LootTables.SteelFishingRodLootTable;

public class ItemSteelFishingRod extends CustomItemFishingRod {
	public ItemSteelFishingRod(String name, int id) {
		super(name, id);
		this.setMaxDamage(1024);
		//this.setLootTable(SteelFishingRodLootTable);

	}
}
