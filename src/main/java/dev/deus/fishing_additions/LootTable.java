package dev.deus.fishing_additions;


import net.minecraft.core.item.Item;

public class LootTable {

	private Item[] Objects;

	public LootTable(Item[] objects) {
		this.Objects = objects;
	}
	public Item getRandomItem(){
		return this.Objects[(int) (Math.random() * this.Objects.length)];
	}
}
