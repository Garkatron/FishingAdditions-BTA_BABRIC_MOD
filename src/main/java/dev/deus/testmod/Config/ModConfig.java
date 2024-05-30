package dev.deus.testmod.Config;

import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static dev.deus.testmod.FishingAdditions.MOD_ID;

public class ModConfig {

	private final int STARTING_BLOCk_ID = 80000;
	private final int STARTING_ITEM_ID = 81000;

	public static int BLOCK_ID;
	public static int ITEM_ID;


	public ModConfig() {

		Properties prop = new Properties();
		prop.setProperty("starting_block_id",String.valueOf(STARTING_BLOCk_ID));
		prop.setProperty("starting_item_id",String.valueOf(STARTING_ITEM_ID));

		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		BLOCK_ID = config.getInt("starting_block_id");
		ITEM_ID = config.getInt("starting_block_id");

		config.updateConfig();


	}
}
