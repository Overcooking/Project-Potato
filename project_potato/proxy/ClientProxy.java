package qwert9203.project_potato.proxy;

import qwert9203.project_potato.init.ModBlocks;
import qwert9203.project_potato.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
