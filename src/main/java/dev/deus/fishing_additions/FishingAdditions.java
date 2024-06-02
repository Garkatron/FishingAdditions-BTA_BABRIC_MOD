package dev.deus.fishing_additions;

import dev.deus.fishing_additions.Blocks.BlockInitializer;
import dev.deus.fishing_additions.Config.ModConfig;
import dev.deus.fishing_additions.Items.ItemGoldFishingRod;
import dev.deus.fishing_additions.Trash.ItemInitializer;
import dev.deus.fishing_additions.TileEntities.TileEntityFishingNetBlock;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.*;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static dev.deus.fishing_additions.Config.ModConfig.newItemID;

// Learning how make a mod xD

public class FishingAdditions implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

    public static final String MOD_ID = "fishing_additions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Item gold_fishing_rod_item = ItemHelper.createItem(MOD_ID,  new ItemGoldFishingRod("GoldFishingRod", newItemID()),"IronFishingRod.png");


    @Override
    public void onInitialize() {
		ModConfig config = new ModConfig();

		EntityHelper.Core.createTileEntity(TileEntityFishingNetBlock.class, "TileEntityFishingNetBlock");

		LOGGER.info("FishingAdditions initialized.");

	}



	@Override
	public void beforeGameStart() {
		BlockInitializer.MakeBlocks(MOD_ID);
		ItemInitializer.Register();

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		RecipeInitializer rcp = new RecipeInitializer();
		rcp.Initialize();
	}

	@Override
	public void initNamespaces() {

	}
}
