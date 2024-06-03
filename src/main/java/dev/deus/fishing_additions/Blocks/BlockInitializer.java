package dev.deus.fishing_additions.Blocks;

//import static dev.deus.fishing_additions.Config.ModConfig.newBlockID;

import dev.deus.fishing_additions.Blocks.BlockModel.CustomBlockModel;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import static dev.deus.fishing_additions.FishingAdditions.config;

public class BlockInitializer {

	public static Block fishing_net_block;
	public void MakeBlocks(String id) {

		BlockBuilder standard_block_builder = new BlockBuilder(id);

		// Creating blocks
		BlockBuilder fishing_net_block_builder = standard_block_builder
			.setBlockModel(CustomBlockModel::new)
			.setBlockSound(BlockSounds.METAL)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setTextures("fishing_additions:block/fishing_net_block")
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);
		;

		fishing_net_block = new FishingNetBlock("fishing_net_block", config.newBlockID());
		fishing_net_block_builder.build(fishing_net_block);

	}
}
