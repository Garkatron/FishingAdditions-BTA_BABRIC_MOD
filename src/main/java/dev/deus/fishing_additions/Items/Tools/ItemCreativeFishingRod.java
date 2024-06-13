package dev.deus.fishing_additions.Items.Tools;

import dev.deus.fishing_additions.Items.CustomClasses.CustomItemFishingRod;

//import static dev.deus.fishing_additions.LootTables.LootTables.IronFishingRodLootTable;

public class ItemCreativeFishingRod extends CustomItemFishingRod {
	public ItemCreativeFishingRod(String name, int id) {
		super(name, id);
		this.setMaxDamage(1000000000);
	}
}
