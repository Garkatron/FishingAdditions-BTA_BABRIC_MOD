package dev.deus.fishing_additions;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.Item;


public class EntityLootTable {
	private Entity[] Objects;

	public EntityLootTable(Entity[] objects) {
		this.Objects = objects;
	}
	public Entity getRandomEntity(){
		return this.Objects[(int) (Math.random() * this.Objects.length)];
	}
}
