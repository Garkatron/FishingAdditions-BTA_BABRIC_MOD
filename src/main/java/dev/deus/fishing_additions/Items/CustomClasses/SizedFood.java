package dev.deus.fishing_additions.Items.CustomClasses;

import net.minecraft.core.item.ItemFood;

import java.util.Random;

public class SizedFood extends ItemFood {

	private int size = 0;
	private int minSize = 0;
	private int maxSize = 0;


	public SizedFood(String name, int id, int sizeMM, int ticksPerHeal, double healingValueFactorPerMM, int baseHealingValue, boolean favouriteWolfMeat, int maxStackSize) {
		// Calculate the healing value using the formula
		super(name, id, (int) (healingValueFactorPerMM * sizeMM + baseHealingValue), ticksPerHeal, favouriteWolfMeat, maxStackSize);
		this.size = (int) (healingValueFactorPerMM * sizeMM + baseHealingValue);


	}

	public SizedFood(String name, int id, int sizeMM, int maxSize, int minSize, int ticksPerHeal, double healingValueFactorPerMM, int baseHealingValue, boolean favouriteWolfMeat, int maxStackSize) {
		// Calculate the healing value using the formula
		super(name, id, (int) (healingValueFactorPerMM * sizeMM + baseHealingValue), ticksPerHeal, favouriteWolfMeat, maxStackSize);
		this.size = (int) (healingValueFactorPerMM * sizeMM + baseHealingValue);
		this.minSize = minSize;
		this.maxSize = maxSize;
	}

	public SizedFood(String name, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize) {
		super(name, id, healAmount, ticksPerHeal, favouriteWolfMeat, maxStackSize);
	}


}
