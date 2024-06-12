package dev.deus.fishing_additions.Items.Utils;

import net.minecraft.core.item.material.ArmorMaterial;
import org.jetbrains.annotations.NotNull;

public class ItemSettings {
	@NotNull
	private String name;

	@NotNull
	private Integer id;

	@NotNull
	private ItemType type;

	private int ticksPerHeal;
	private boolean favouriteWolfMeat;
	private int maxStackSize;
	private int healAmount;
	private ArmorMaterial material;
	private int armorPiece;

	public ItemSettings(@NotNull ItemType itemType,@NotNull Integer id, @NotNull String name) {
		this.id = id;
		this.name = name;
		this.type = itemType;
	}

	// Getters
	public ItemType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getTicksPerHeal() {
		return ticksPerHeal;
	}

	public boolean isFavouriteWolfMeat() {
		return favouriteWolfMeat;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public int getHealAmount() {
		return healAmount;
	}

	public ArmorMaterial getMaterial() {
		return material;
	}

	public int getArmorPiece() {
		return armorPiece;
	}

	// Setters
	public void setType(ItemType type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTicksPerHeal(int ticksPerHeal) {
		this.ticksPerHeal = ticksPerHeal;
	}

	public void setFavouriteWolfMeat(boolean favouriteWolfMeat) {
		this.favouriteWolfMeat = favouriteWolfMeat;
	}

	public void setMaxStackSize(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}

	public void setHealAmount(int healAmount) {
		this.healAmount = healAmount;
	}

	public void setMaterial(ArmorMaterial material) {
		this.material = material;
	}

	public void setArmorPiece(int armorPiece) {
		this.armorPiece = armorPiece;
	}
}
