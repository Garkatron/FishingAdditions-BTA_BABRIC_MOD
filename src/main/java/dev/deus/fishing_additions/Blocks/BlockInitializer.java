package dev.deus.fishing_additions.Blocks;

//import static dev.deus.fishing_additions.Config.ModConfig.newBlockID;

import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class BlockInitializer {

	public static Block fishing_net_block;
	public void MakeBlocks(String id) {

		BlockBuilder MetalBlockBuilder = new BlockBuilder(id);

		// Creating blocks
		BlockBuilder fishing_net_block_builder = MetalBlockBuilder
			.setBlockModel(new BlockModelRenderBlocks(0))
			.setTextures("fishing_net_block.png")
			.setBlockSound(BlockSounds.METAL)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		;

		fishing_net_block = new FishingNetBlock("FishingNetBlock", config.newBlockID());
		fishing_net_block_builder.build(fishing_net_block);

	}
}
