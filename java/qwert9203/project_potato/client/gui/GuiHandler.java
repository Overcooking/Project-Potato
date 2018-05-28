package qwert9203.project_potato.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import qwert9203.project_potato.container.ContainerAltarCore;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;

public class GuiHandler implements IGuiHandler{
	
	public static final int ALTAR_CORE = 1;	

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ALTAR_CORE) {
			return new ContainerAltarCore(player.inventory, (TileEntityAltarCore) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ALTAR_CORE) {
			return new GuiAltarCore(player.inventory, (TileEntityAltarCore) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
