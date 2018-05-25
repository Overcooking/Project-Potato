package qwert9203.project_potato.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.init.items.FuelHandler;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;
import qwert9203.project_potato.tilenetity.TileEntityPotatoMasher;
import qwert9203.project_potato.worldgen.Oregen;

public class CommonProxy {
	
	
	public void Init() {
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(new Oregen(), 0);
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityPotatoMasher.class, Reference.MODID + ":potato_masher");
		GameRegistry.registerTileEntity(TileEntityAltarCore.class, Reference.MODID + ":altar_core");
	}

	public void registerRenders() {
		
	}
}
