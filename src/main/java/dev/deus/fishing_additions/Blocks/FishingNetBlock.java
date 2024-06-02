package dev.deus.fishing_additions.Blocks;

import dev.deus.fishing_additions.TileEntities.TileEntityFishingNetBlock;
import dev.deus.fishing_additions.TileEntities.TransparentBlockTileEntityRotatable;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.world.World;
import net.minecraft.core.block.entity.TileEntity;

import java.util.Timer;
import java.util.TimerTask;

public class FishingNetBlock extends TransparentBlockTileEntityRotatable {

	// Time in milliseconds
	private final long requiredTime; // Time to generate a fish
	private Timer timer;
	private IInventory tile_entity_chest;
	private int currentSlotIndex = 0;

	public FishingNetBlock(String key, int id) {
		super(key, id, Material.metal);
		this.requiredTime = 5 * 60 * 1000L; // 5minutes
	}

	// Own functions

	private void startTimer(World world, int x, int y, int z) {
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				int blockId1 = world.getBlockId(x + 1, y, z);
				int blockId2 = world.getBlockId(x - 1, y, z);
				int blockId3 = world.getBlockId(x + 1, y, z + 1);
				int blockId4 = world.getBlockId(x - 1, y, z - 1);
				int blockId5 = world.getBlockId(x, y + 1, z);
				int blockId6 = world.getBlockId(x, y - 1, z);
				int blockId7 = world.getBlockId(x, y + 1, z + 1);
				int blockId8 = world.getBlockId(x, y - 1, z - 1);

				if (blockId1 == 271 && blockId2 == 271 && blockId3 == 271 && blockId4 == 271 && blockId5 == 271 && blockId6 == 271 && blockId7 == 271 && blockId8 == 271) {

					if (tile_entity_chest != null) {
						System.out.println(tile_entity_chest.getStackInSlot(1));

						ItemStack stackToDistribute = new ItemStack(Item.foodFishRaw);

						while (currentSlotIndex < tile_entity_chest.getSizeInventory()) {
							ItemStack currentStack = tile_entity_chest.getStackInSlot(currentSlotIndex);

							if (currentStack == null) {
								tile_entity_chest.setInventorySlotContents(currentSlotIndex, stackToDistribute.copy());
								break;
							}

							currentSlotIndex++;

							if (currentSlotIndex >= tile_entity_chest.getSizeInventory()) {
								currentSlotIndex = 0;
							}
						}
					}
				} else {
					System.out.println("Not all adjacent blocks have ID 271.");
				}

				System.out.println("Time passed");

			}
		}, 0, requiredTime);
	}

	private void stopTimer() {
		timer.cancel();
	}

	public void displayGui(EntityPlayer player, IInventory inventory) {
		player.displayGUIChest(inventory);
	}

	// Override
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.timer = new Timer();
		tile_entity_chest = (TileEntityFishingNetBlock) world.getBlockTileEntity(x, y, z);

		startTimer(world, x, y, z);

	}

	@Override
	public void onBlockRemoved(World world, int x, int y, int z, int data) {
		stopTimer();
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
