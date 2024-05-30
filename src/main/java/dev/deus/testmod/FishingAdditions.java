package dev.deus.testmod;

import dev.deus.testmod.Config.ModConfig;
import dev.deus.testmod.TileEntities.TileEntityFishingNetBlock;
import turniplabs.halplibe.helper.*;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

// Learning how make a mod xD

public class FishingAdditions implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
		ModConfig config = new ModConfig();
		EntityHelper.Core.createTileEntity(TileEntityFishingNetBlock.class, "TileEntityFishingNetBlock");
		BlockInitializer.MakeBlocks(MOD_ID);
		LOGGER.info("ExampleMod initialized.");

	}



	@Override
	public void beforeGameStart() {

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
