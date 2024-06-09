package dev.deus.fishing_additions.Items;

import deus.rarity.RarityLevel;
import deus.rarity.interfaces.IItemMixin;
import dev.deus.fishing_additions.Debug.Debug;
import dev.deus.fishing_additions.Items.Ingredients.HydraScale;
import dev.deus.fishing_additions.Items.Tools.ItemGoldFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemIronFishingRod;
import dev.deus.fishing_additions.Items.Tools.ItemSteelFishingRod;
import dev.deus.fishing_additions.Tools.StaticFieldsExtractor;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;

import java.lang.reflect.Field;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;
import static dev.deus.fishing_additions.FishingAdditions.config;
import static dev.deus.fishing_additions.Tools.ItemUtils.makeFood;
import static dev.deus.fishing_additions.Tools.ItemUtils.makeItem;

public class FishingAdditionsItems {

	//

	public static final ItemBuilder GenericItemBuilder = new ItemBuilder(MOD_ID);

	//
	public static ItemFood pufferfish;
	public static ItemFood salmon;
	public static ItemFood tropical_fish;
	public static ItemFood cod_fish;
	public static ItemFood cooked_salmon;
	public static ItemFood cooked_cod;
	public static ItemFood gold_fish;
	public static ItemFood cooked_gold_fish;

	// Fishing Rod
	public static Item gold_fishing_rod_item;
	public static Item iron_fishing_rod_item;
	public static Item steel_fishing_rod_item;




	public static ItemFood cooked_fish_soup;

	// Ingredients
	public static Item hydra_scale;


	public void Initialize() {

		// Fishes
		pufferfish = makeFood(config.newItemID(), "pufferfish", 1, 2, false, 64, RarityLevel.COMMON);
		tropical_fish = makeFood(config.newItemID(), "tropical_fish", 2, 4, false, 64, RarityLevel.COMMON);

		salmon = makeFood(config.newItemID(), "salmon", 3, 6, false, 64);
		cooked_salmon = makeFood(config.newItemID(), "cooked_salmon", 8, 10, false, 64, RarityLevel.COMMON);

		cod_fish = makeFood(config.newItemID(), "cod_fish", 2, 4, false, 64, RarityLevel.COMMON);
		cooked_cod = makeFood(config.newItemID(), "cooked_cod", 7, 9, false, 64, RarityLevel.COMMON);

		gold_fish = makeFood(config.newItemID(), "gold_fish", 6, 8, false, 64, RarityLevel.UNCOMMON);
		cooked_gold_fish = makeFood(config.newItemID(), "cooked_gold_fish", 10, 12, false, 64, RarityLevel.UNCOMMON);

		// Food
		cooked_fish_soup = makeFood(config.newItemID(), "cooked_fish_soup", 16, 16, false, 64, RarityLevel.COMMON);

		// Tools
		gold_fishing_rod_item = makeItem(config.newItemID(),"gold_fishing_rod", RarityLevel.COMMON);

		iron_fishing_rod_item = makeItem(config.newItemID(),"iron_fishing_rod", RarityLevel.COMMON);

		steel_fishing_rod_item = makeItem(config.newItemID(),"steel_fishing_rod", RarityLevel.COMMON);

		// Ingredients
		hydra_scale = makeItem(config.newItemID(),"hydra_scale", RarityLevel.RARE);

		// here
		assignPriorities();

	}




	public void assignPriorities() {
		try {
			String[] staticFieldNames = StaticFieldsExtractor.extractor(this.getClass());
			for (String fieldName : staticFieldNames) {
				Field field = this.getClass().getDeclaredField(fieldName);
				field.setAccessible(true);
				Object value = field.get(null);

				if (value instanceof Item) {
					Item item = (Item) value;
					CreativeHelper.setPriority(item, 1000);
					Debug.println("RARITY_CAST: " + item.getStatName());
					Debug.println(((IItemMixin)item).rarityLib$getRarityLevel().toString());
				}
			}
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}



}

