package dev.deus.testmod.TileEntities;

import com.mojang.nbt.CompoundTag;
import com.mojang.nbt.ListTag;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.IInventory;

public class TileEntityFishingNetBlock extends TileEntity implements IInventory {
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
		// Implementa el método según tus necesidades
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) {
		this.contents[i] = itemStack;
	}

	@Override
	public String getInvName() {
		return "Big Chest";
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
