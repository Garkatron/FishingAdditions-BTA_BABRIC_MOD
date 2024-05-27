package dev.deus.testmod;

import dev.deus.testmod.Blocks.FishingNetBlock;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static dev.deus.testmod.ExampleMod.MOD_ID;

public class BlockInitializer {

	public static int blockId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2000");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");

		config.updateConfig();
	}
	public static void MakeBlocks(String id) {

		BlockBuilder MetalBlockBuilder = new BlockBuilder(id);

		// Creating blocks
		BlockBuilder fishing_net_block_builder = MetalBlockBuilder
			.setBlockModel(new BlockModelRenderBlocks(0))
			.setTextures("FishingNetBlock.png")
			.setBlockSound(BlockSounds.METAL)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		;
		Block fishing_net_block = new FishingNetBlock("FishingNetBlock", blockId++);

		fishing_net_block_builder.build(fishing_net_block);

	}
}
