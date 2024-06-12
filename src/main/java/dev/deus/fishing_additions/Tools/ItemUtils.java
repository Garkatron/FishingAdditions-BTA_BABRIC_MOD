package dev.deus.fishing_additions.Tools;


import deus.rarity_lib.Interfaces.mixin.IItemRarityMixin;
import deus.rarity_lib.RarityLevel;
import dev.deus.fishing_additions.Items.Utils.ItemSettings;
import dev.deus.fishing_additions.Items.Utils.ItemType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemFood;

import static dev.deus.fishing_additions.Items.FishingAdditionsItems.GenericItemBuilder;

public class ItemUtils {


	public static Item genericMakeItem(ItemSettings settings) {
		Item item = null;

		switch (settings.getType()) {
			case FOOD:
				item = new ItemFood(settings.getName(), settings.getId(), settings.getHealAmount(), settings.getTicksPerHeal(), settings.isFavouriteWolfMeat(), settings.getMaxStackSize());
				break;
			case ITEM:
				item = new Item(settings.getName(), settings.getId());
				break;
			case ARMOR:
				if (settings.getMaterial() == null) {
					throw new IllegalArgumentException("Material cannot be null for ARMOR items.");
				}
				item = new ItemArmor(settings.getName(), settings.getId(), settings.getMaterial(), settings.getArmorPiece());
				break;
			default:
				throw new IllegalArgumentException("Invalid item type: " + settings.getType());
		}
		return GenericItemBuilder.build(item);
	}

	public static Item rarityMakeItem(ItemSettings settings, RarityLevel rarityLevel) {
		Item item = null;

		switch (settings.getType()) {
			case FOOD:
				item = new ItemFood(settings.getName(), settings.getId(), settings.getHealAmount(), settings.getTicksPerHeal(), settings.isFavouriteWolfMeat(), settings.getMaxStackSize());
				break;
			case ITEM:
				item = new Item(settings.getName(), settings.getId());
				break;
			case ARMOR:
				if (settings.getMaterial() == null) {
					throw new IllegalArgumentException("Material cannot be null for ARMOR items.");
				}
				item = new ItemArmor(settings.getName(), settings.getId(), settings.getMaterial(), settings.getArmorPiece());
				break;
			default:
				throw new IllegalArgumentException("Invalid item type: " + settings.getType());
		}

		IItemRarityMixin finalItem = ((IItemRarityMixin)GenericItemBuilder.build(item));
		finalItem.rarityLib$setRarityLevel(rarityLevel);

		return (Item) finalItem;
	}

	public static Item makeItem(int id, String name) {
		return makeItem(id, name, RarityLevel.COMMON);
	}

	public static Item 	makeItem(int id, String name, RarityLevel rarity) {
		Item item = GenericItemBuilder
			.build(new Item(name, id));

		((IItemRarityMixin) item).rarityLib$setRarityLevel(rarity);
		return item;
	}

	public static Item makeItem(Item item, RarityLevel rarity) {
		Item _item = GenericItemBuilder
			.build(item);

		((IItemRarityMixin) _item).rarityLib$setRarityLevel(rarity);
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

		((IItemRarityMixin) food).rarityLib$setRarityLevel(rarity);
		return food;
	}
}
