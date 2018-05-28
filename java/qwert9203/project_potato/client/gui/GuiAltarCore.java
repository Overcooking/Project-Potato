package qwert9203.project_potato.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.container.ContainerAltarCore;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;

public class GuiAltarCore extends GuiContainer{
	
	private TileEntityAltarCore te;
	private IInventory playerInventory;

	public GuiAltarCore(IInventory playerInventory, TileEntityAltarCore te) {
		super(new ContainerAltarCore(playerInventory, te));
		
		this.xSize = 176;
		this.ySize = 166;
		
		this.te = te;
		this.playerInventory = playerInventory;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/container/altar_core.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		String s = I18n.format("container.altar_core");
		this.mc.fontRendererObj.drawString(s, this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); //Draws the block breaker name in the center on the top of the gui
		this.mc.fontRendererObj.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8, 72, 4210752); //The player's inventory name
	}
	
	

}
