package dev.deus.fishing_additions;

import dev.deus.fishing_additions.Blocks.BlockInitializer;
import dev.deus.fishing_additions.Config.ModConfig;
import dev.deus.fishing_additions.Debug.Debug;
import dev.deus.fishing_additions.Items.FishingAdditionsItems;
import dev.deus.fishing_additions.Items.ItemGoldFishingRod;
import dev.deus.fishing_additions.Items.ItemIronFishingRod;
import dev.deus.fishing_additions.Trash.ItemInitializer;
import dev.deus.fishing_additions.TileEntities.TileEntityFishingNetBlock;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.*;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class FishingAdditions implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {

	public static ModConfig config = new ModConfig();
	public static final String MOD_ID = "fishing_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//public static Item iron_fishing_rod_item = ItemHelper.createItem(MOD_ID, new ItemIronFishingRod("IronFishingRod", config.newItemID()), "gold_fishing_rod.png");

	@Override
	public void onInitialize() {

		// Inicializa TileEntity
		EntityHelper.Core.createTileEntity(TileEntityFishingNetBlock.class, "TileEntityFishingNetBlock");
		LOGGER.info("FishingAdditions initialized.");
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
		//RecipeInitializer rcp = new RecipeInitializer();
		//rcp.Initialize();
	}

	@Override
	public void initNamespaces() {
		// Inicialización de namespaces si es necesario
	}
}
