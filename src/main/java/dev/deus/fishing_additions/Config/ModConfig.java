package dev.deus.fishing_additions.Config;

import dev.deus.fishing_additions.Debug.Debug;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;

public class ModConfig {

	private int BLOCK_ID;
	private int ITEM_ID;

	public int newBlockID() {
		Debug.println("FISHING ADDITIONS MOD CONFIG: PRE BLOCK ID: " + BLOCK_ID);
		BLOCK_ID = BLOCK_ID + 1;

		Debug.println("FISHING ADDITIONS MOD CONFIG: NEW BLOCK ID: " + BLOCK_ID);
		return BLOCK_ID;
	}

	public int newItemID() {
		Debug.println("FISHING ADDITIONS MOD CONFIG: PRE ITEM ID: " + ITEM_ID);
		ITEM_ID = ITEM_ID + 1;
		Debug.println("FISHING ADDITIONS MOD CONFIG: NEW ITEM ID: " + ITEM_ID);
		return ITEM_ID;
	}

	public ModConfig() {
		Properties prop = new Properties();

		int STARTING_BLOCK_ID = 10000;
		Debug.println("FISHING ADDITIONS MOD CONFIG: PRE STARTING BLOCK ID: " + STARTING_BLOCK_ID);
		prop.setProperty("starting_block_id", String.valueOf(STARTING_BLOCK_ID));

		int STARTING_ITEM_ID = 11000;
		Debug.println("FISHING ADDITIONS MOD CONFIG: PRE STARTING ITEM ID: " + STARTING_ITEM_ID);
		prop.setProperty("starting_item_id", String.valueOf(STARTING_ITEM_ID));

		ConfigHandler config = new ConfigHandler(MOD_ID, prop);

		// Leer los valores de la configuración, usando valores predeterminados si no están presentes
		BLOCK_ID = config.getInt("starting_block_id");
		Debug.println("FISHING ADDITIONS MOD CONFIG: STARTING BLOCK ID: " + BLOCK_ID);

		ITEM_ID = config.getInt("starting_item_id");
		Debug.println("FISHING ADDITIONS MOD CONFIG: STARTING ITEM ID: " + ITEM_ID);

		config.updateConfig();
	}
}
