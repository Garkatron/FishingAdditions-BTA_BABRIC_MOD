package dev.deus.fishing_additions.Items.CustomClasses;

import net.minecraft.core.item.ItemFood;

public class CustomItemFood extends ItemFood {
	// Constants for the formula


	public CustomItemFood(String name, int id, int sizeMM, int ticksPerHeal, int healingValueFactorPerMM, int baseHealingValue, boolean favouriteWolfMeat, int maxStackSize) {
		// Calculate the healing value using the formula
		super(name, id, (int) (healingValueFactorPerMM * sizeMM + baseHealingValue), ticksPerHeal, favouriteWolfMeat, maxStackSize);

	}

	public CustomItemFood(String name, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize) {
		super(name, id, healAmount, ticksPerHeal, favouriteWolfMeat, maxStackSize);
	}
}
