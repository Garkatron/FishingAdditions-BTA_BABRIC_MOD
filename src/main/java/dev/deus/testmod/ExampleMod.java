package dev.deus.testmod;

import dev.deus.testmod.TileEntities.TileEntityFishingNetBlock;
import net.minecraft.client.render.Texture;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import turniplabs.halplibe.helper.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;

// Learning how make a mod xD

public class ExampleMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

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

	}

	@Override
	public void initNamespaces() {

	}
}
