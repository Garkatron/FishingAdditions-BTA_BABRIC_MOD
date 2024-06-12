package dev.deus.fishing_additions;

import dev.deus.fishing_additions.Blocks.BlockInitializer;
import dev.deus.fishing_additions.Config.ModConfig;
import dev.deus.fishing_additions.Items.FishingAdditionsItems;
import dev.deus.fishing_additions.Recipes.RecipeInitializer;
import dev.deus.fishing_additions.TileEntities.TileEntityFishingNetBlock;
import dev.deus.fishing_additions.Tools.Debug.Debug;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static dev.deus.fishing_additions.Tools.Debug.Debug.isDebug;

public class FishingAdditions implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

	public static ModConfig config = new ModConfig();
	public static final String MOD_ID = "fishing_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//public static Item iron_fishing_rod_item = ItemHelper.createItem(MOD_ID, new ItemIronFishingRod("IronFishingRod", config.newItemID()), "gold_fishing_rod.png");

	@Override
	public void onInitialize() {

		isDebug = java.lang.management.ManagementFactory.getRuntimeMXBean().
			getInputArguments().toString().contains("-agentlib:jdwp");


		// Inicializa TileEntity
		EntityHelper.createTileEntity(TileEntityFishingNetBlock.class, "TileEntityFishingNetBlock");
		LOGGER.info("FishingAdditions initialized. Debug: "+ isDebug);
	}

	@Override
	public void beforeGameStart() {
		// Asegúrate de que todos los bloques están correctamente registrados
		new BlockInitializer().MakeBlocks(MOD_ID);
		new FishingAdditionsItems().Initialize();

	}

	@Override
	public void afterGameStart() {
		// Posibles inicializaciones posteriores al inicio del juego
	}

	@Override
	public void onRecipesReady() {
		RecipeInitializer rcp = new RecipeInitializer();
		rcp.Initialize();
	}

	@Override
	public void initNamespaces() {
		// Inicialización de namespaces si es necesario
	}
}
