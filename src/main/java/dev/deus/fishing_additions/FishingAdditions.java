package dev.deus.fishing_additions;

import dev.deus.fishing_additions.Blocks.BlockInitializer;
import dev.deus.fishing_additions.Config.ModConfig;
import dev.deus.fishing_additions.Items.FishingAdditionsItems;
import dev.deus.fishing_additions.Recipes.RecipeInitializer;
import dev.deus.fishing_additions.Blocks.FishingNetBlock.TileEntityFishingNetBlock;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static dev.deus.fishing_additions.DevTools.Debug.Debug.isDebug;

public class FishingAdditions implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

	public static ModConfig config = new ModConfig();
	public static final String MOD_ID = "fishing_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		isDebug = java.lang.management.ManagementFactory.getRuntimeMXBean().
			getInputArguments().toString().contains("-agentlib:jdwp");

		EntityHelper.createTileEntity(TileEntityFishingNetBlock.class, "TileEntityFishingNetBlock");
		LOGGER.info("Fishing Additions initialized. Debug: "+ isDebug);
	}

	@Override
	public void beforeGameStart() {

		new BlockInitializer().MakeBlocks(MOD_ID);
		new FishingAdditionsItems().Initialize();

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
