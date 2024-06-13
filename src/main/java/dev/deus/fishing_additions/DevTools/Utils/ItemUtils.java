package dev.deus.fishing_additions.DevTools.Utils;


import deus.rarity_lib.Interfaces.mixin.IItemRarityMixin;
import deus.rarity_lib.RarityLevel;
import dev.deus.fishing_additions.DevTools.Debug.Debug;
import dev.deus.fishing_additions.Items.CustomClasses.SizedFood;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.CreativeHelper;

import java.lang.reflect.Field;

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

	public static ItemFood makeSizedFood(int id, String name, int sizeMM, int ticksPerHeal, double healingValueFactorPerMM, int baseHealingValue, boolean favouriteWolfMeat, int maxStackSize, RarityLevel rarity) {
		SizedFood food = GenericItemBuilder
			.build(new SizedFood(
				name,
				id,
				sizeMM,
				ticksPerHeal,
				healingValueFactorPerMM,
				baseHealingValue,
				favouriteWolfMeat,
				maxStackSize
			));

		((IItemRarityMixin) food).rarityLib$setRarityLevel(rarity);
		return food;
	}

	public static void assignPriorities(Class<?> c) {
		int initialPriority = 1001;
		try {
			String[] staticFieldNames = StaticFieldsExtractor.extractor(c);
			for (String fieldName : staticFieldNames) {
				Field field = c.getDeclaredField(fieldName);
				field.setAccessible(true);
				Object value = field.get(null);

				if (value instanceof Item) {
					Item item = (Item) value;
					CreativeHelper.setPriority(item, initialPriority);
					initialPriority++;
					Debug.println("RARITY_CAST: " + item.getStatName());
					Debug.println(((IItemRarityMixin)item).rarityLib$getRarityLevel().toString());
				}
			}
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
