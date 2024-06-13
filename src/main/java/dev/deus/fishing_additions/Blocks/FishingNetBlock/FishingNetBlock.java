package dev.deus.fishing_additions.Blocks.FishingNetBlock;

import dev.deus.fishing_additions.TileEntities.TransparentBlockTileEntityRotatable;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.world.World;

public class FishingNetBlock extends TransparentBlockTileEntityRotatable {

	public FishingNetBlock(String key, int id) {
		super(key, id, Material.metal);
	}

	public void displayGui(EntityPlayer player, IInventory inventory) {
		player.displayGUIChest(inventory);

	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
	}

	@Override
	public void onBlockRemoved(World world, int x, int y, int z, int data) {
		super.onBlockRemoved(world, x, y, z, data);
	}


	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer entityplayer) {

		IInventory chest = (TileEntityFishingNetBlock) world.getBlockTileEntity(x, y, z);

		if (!world.isClientSide) {
			this.displayGui(entityplayer, chest);
		}
		return true;
	}

	@Override
	protected TileEntity getNewBlockEntity() {
		return new TileEntityFishingNetBlock();
	}
}
