package dev.deus.fishing_additions.Items.Tools;

import dev.deus.fishing_additions.Entities.CustomBobberEntity;
import dev.deus.fishing_additions.Items.CustomClasses.CustomItemFishingRod;
import dev.deus.fishing_additions.LootTable;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import static dev.deus.fishing_additions.Items.FishingAdditionsItems.gold_fishing_rod_item;
import static dev.deus.fishing_additions.Items.LootTables.LootTables.GoldFishingRodLootTable;

public class ItemGoldFishingRod extends CustomItemFishingRod {


	public ItemGoldFishingRod(String name, int id) {
		super(name, id);
		this.setMaxDamage(128);
		this.setMaxStackSize(1);
		this.setLootTable(GoldFishingRodLootTable);

	}



}
