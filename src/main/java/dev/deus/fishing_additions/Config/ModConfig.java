package dev.deus.fishing_additions.Config;

import dev.deus.fishing_additions.DevTools.Debug.Debug;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static dev.deus.fishing_additions.FishingAdditions.MOD_ID;

public class ModConfig {

	private int BLOCK_ID;
	private int ITEM_ID;

	private static ConfigHandler config;

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
	public int getInt(String key){
		return config.getInt(key);
	}

	public double getDouble(String key){
		return Double.parseDouble(config.getString(key));
	}

	public String getString(String key){
		return config.getString(key);
	}

	public ModConfig() {
		Properties prop = new Properties();

		int STARTING_BLOCK_ID = 10000;
		int STARTING_ITEM_ID = 11000;

		// IDs
		prop.setProperty("block.starting.id", String.valueOf(STARTING_BLOCK_ID));
		prop.setProperty("item.starting.id", String.valueOf(STARTING_ITEM_ID));

		// Food Values
		prop.setProperty("food.sized.healing_factor", "0.1");
		prop.setProperty("food.sized.base_healing", String.valueOf(0));

		// Block values
		prop.setProperty("block.fishingNetBlock.needed_ticks_catch_fishes", String.valueOf(5000));


		config = new ConfigHandler(MOD_ID, prop);

		BLOCK_ID = config.getInt("block.starting.id");
		ITEM_ID = config.getInt("item.starting.id");

		config.updateConfig();
	}
}
