package dev.deus.testmod.GUIs;

import net.minecraft.client.gui.GuiContainer;
import net.minecraft.core.player.inventory.Container;
import net.minecraft.core.player.inventory.ContainerChest;
import net.minecraft.core.player.inventory.IInventory;
import org.lwjgl.opengl.GL11;

public class FishingNetBlockGui extends GuiContainer {
	private IInventory inventory;
	private final int inventoryRows;

	public FishingNetBlockGui(IInventory iinventory, IInventory iinventory1) {
		super(new ContainerChest(iinventory, iinventory1));
		this.allowIngameInput = false;
		this.inventoryRows = inventory.getSizeInventory() / 9;
		this.ySize = 222 - 108 + this.inventoryRows * 18;
	}

	@Override
	protected void drawGuiContainerForegroundLayer() {
		this.fontRenderer.drawString(this.inventory.getInvName(), 8, 6, 0x404040);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f) {
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		int h1 = Math.min(this.inventoryRows, 6) * 18 + 17;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, h1);
		int rows = this.inventoryRows;
		while (rows > 6) {
			int h2 = Math.min(rows, 6) * 18;
			this.drawTexturedModalRect(x, y + h1, 0, 17, this.xSize, h2);
			rows -= 6;
			h1 += h2;
		}
		this.drawTexturedModalRect(x, y + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
	}
}
