package dev.deus.fishing_additions.Tools;

import deus.rarity.RarityLevel;
import deus.rarity.interfaces.IItemMixin;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;

import static dev.deus.fishing_additions.Items.FishingAdditionsItems.GenericItemBuilder;

public class ItemUtils {
	public static Item makeItem(int id, String name) {
		return makeItem(id, name, RarityLevel.COMMON);
	}

	public static Item 	makeItem(int id, String name, RarityLevel rarity) {
		Item item = GenericItemBuilder
			.build(new Item(name, id));

		((IItemMixin) item).rarityLib$setRarityLevel(rarity);
		return item;
	}

	public static Item makeItem(Item item, RarityLevel rarity) {
		Item _item = GenericItemBuilder
			.build(item);

		((IItemMixin) _item).rarityLib$setRarityLevel(rarity);
		return _item;
	}

	public static ItemFood makeFood(int id, String name, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize) {
		return makeFood(id, name, healAmount, ticksPerHeal, favouriteWolfMeat, maxStackSize, RarityLevel.COMMON);
	}

	public static ItemFood makeFood(int id, String name, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize, RarityLevel rarity) {
		ItemFood food = GenericItemBuilder
			.build(new ItemFood(
				name,
				id,
				healAmount,
				ticksPerHeal,
				favouriteWolfMeat,
				maxStackSize
			));

		((IItemMixin) food).rarityLib$setRarityLevel(rarity);
		return food;
	}
}
