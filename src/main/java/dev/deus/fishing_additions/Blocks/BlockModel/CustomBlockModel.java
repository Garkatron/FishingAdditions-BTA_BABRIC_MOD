package dev.deus.fishing_additions.Blocks.BlockModel;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;

public class CustomBlockModel<T extends Block> extends BlockModelStandard<T> {
	public CustomBlockModel(Block block) {
		super(block);
	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		boolean flag = false;

		block.setBlockBounds(0, 0, 0, 1, 1, 1);
		flag = this.renderStandardBlock(tessellator, this.block, x, y, z);

		this.block.setBlockBoundsBasedOnState(BlockModelStandard.renderBlocks.blockAccess, x, y, z);
		return flag;
	}

	public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha) {

		block.setBlockBounds(0, 0, 0, 1, 1, 1);

		super.renderBlockOnInventory(tessellator, metadata, brightness, 0);
	}
}
