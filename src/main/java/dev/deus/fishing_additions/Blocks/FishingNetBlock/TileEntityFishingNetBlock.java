package dev.deus.fishing_additions.Blocks.FishingNetBlock;

import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.world.World;

import static dev.deus.fishing_additions.FishingAdditions.config;
import static dev.deus.fishing_additions.LootTables.LootTables.FishingNetBlockLootTable;

public class TileEntityFishingNetBlock extends TileEntity implements IInventory {


	// Time in milliseconds
	private int currentSlotIndex = 0;
	private boolean isActive = false;

	private static final int TICK_INTERVAL = config.getInt("block.fishingNetBlock.needed_ticks_catch_fishes");
	private int ticksPassed = 0;

	protected ItemStack[] contents;

	public TileEntityFishingNetBlock() {
		this.contents = new ItemStack[getSizeInventory()];
	}

	@Override
	public int getSizeInventory() {
		return 16; // Cambia este valor según la cantidad de slots de tu inventario
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return this.contents[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}

	@Override
	public void tick() {
		super.tick();

		World world = super.worldObj;
		int blockId1 = world.getBlockId(x + 1, y, z);
		int blockId2 = world.getBlockId(x - 1, y, z);
		int blockId3 = world.getBlockId(x + 1, y, z + 1);
		int blockId4 = world.getBlockId(x - 1, y, z - 1);
		int blockId5 = world.getBlockId(x, y + 1, z);
		int blockId6 = world.getBlockId(x, y - 1, z);
		int blockId7 = world.getBlockId(x, y + 1, z + 1);
		int blockId8 = world.getBlockId(x, y - 1, z - 1);


		if (blockId1 == 271 && blockId2 == 271 && blockId3 == 271 && blockId4 == 271 && blockId5 == 271 && blockId6 == 271 && blockId7 == 271 && blockId8 == 271) {
			isActive = true;
		}

		ticksPassed++;
		if (ticksPassed >= TICK_INTERVAL) {
			if (isActive) {
				update();
			}
			ticksPassed=0;

		}

	}

	private void update() {

			//System.out.println(this.getStackInSlot(1));

			ItemStack stackToDistribute = FishingNetBlockLootTable.getRandomItemWithProbability();

			while (stackToDistribute==null){
				stackToDistribute = FishingNetBlockLootTable.getRandomItemWithProbability();
			}

			while (currentSlotIndex < this.getSizeInventory()) {
				ItemStack currentStack = this.getStackInSlot(currentSlotIndex);

				if (currentStack == null) {
					this.setInventorySlotContents(currentSlotIndex, stackToDistribute.copy());
					break;
				}

				currentSlotIndex++;

				if (currentSlotIndex >= this.getSizeInventory()) {
					currentSlotIndex = 0;
				}
			}

	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) {
		this.contents[i] = itemStack;
	}

	@Override
	public String getInvName() {
		return "Fishing Net Block";
	}

	// Métodos readFromNBT y writeToNBT

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityPlayer) {
		return true; // Cambia la lógica según tus necesidades
	}

	@Override
	public void sortInventory() {
		// Implementa la lógica de clasificación según tus necesidades
	}
}
