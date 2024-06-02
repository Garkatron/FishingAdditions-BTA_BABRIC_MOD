package dev.deus.fishing_additions.TileEntities;

import net.minecraft.core.block.BlockTileEntityRotatable;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.WorldSource;

public class TransparentBlockTileEntityRotatable extends BlockTileEntityRotatable  {

	private boolean renderInside;

	public TransparentBlockTileEntityRotatable(String key, int id, Material material) {
		super(key, id, material);
	}

	public void BlockTransparent(String key, int id, Material material, boolean renderInside) {
		this.renderInside = renderInside;
	}

	public boolean isSolidRender() {
		return false;
	}

	public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
		return !this.renderInside && blockAccess.getBlockId(x, y, z) == this.id ? false : super.shouldSideBeRendered(blockAccess, x, y, z, side);
	}

	@Override
	protected TileEntity getNewBlockEntity() {
		return null;
	}
}
