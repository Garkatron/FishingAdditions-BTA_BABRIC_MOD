package dev.deus.fishing_additions.Items.Ingredients;

import deus.rarity.RarityLevel;
import deus.rarity.interfaces.IItemMixin;
import dev.deus.fishing_additions.Debug.Debug;
import net.minecraft.core.item.Item;

public class HydraScale extends Item {
	public HydraScale(String name, int id) {
		super(name, id);
		((IItemMixin) this).rarityLib$setRarityLevel(RarityLevel.RARE);

		Debug.println(((IItemMixin) this).rarityLib$getRarityLevel().toString());
	}
}
