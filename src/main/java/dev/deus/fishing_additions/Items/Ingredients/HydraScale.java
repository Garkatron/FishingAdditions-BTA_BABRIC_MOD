package dev.deus.fishing_additions.Items.Ingredients;

import deus.rarity_lib.Interfaces.mixin.IItemRarityMixin;
import deus.rarity_lib.RarityLevel;
import dev.deus.fishing_additions.DevTools.Debug.Debug;
import net.minecraft.core.item.Item;

public class HydraScale extends Item {
	public HydraScale(String name, int id) {
		super(name, id);
		((IItemRarityMixin) this).rarityLib$setRarityLevel(RarityLevel.RARE);

		Debug.println(((IItemRarityMixin) this).rarityLib$getRarityLevel().toString());
	}
}
