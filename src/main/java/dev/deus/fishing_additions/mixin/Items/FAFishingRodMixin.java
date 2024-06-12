package dev.deus.fishing_additions.mixin.Items;

import net.minecraft.core.entity.EntityBobber;
import net.minecraft.core.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static dev.deus.fishing_additions.Items.LootTables.LootTables.VanilaFishingRodLootTable;


@Mixin(EntityBobber.class)
public class FAFishingRodMixin {

	@ModifyArg(method = "yoink()I", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/entity/EntityItem;<init>(Lnet/minecraft/core/world/World;DDDLnet/minecraft/core/item/ItemStack;)V"), index = 4,remap = false)
	private ItemStack modifyItemStack(ItemStack originalStack) {

		return VanilaFishingRodLootTable.getRandomItemWithProbability();
	}

}
