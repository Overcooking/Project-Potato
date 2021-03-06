package qwert9203.project_potato;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import qwert9203.project_potato.handlers.RecipeHandler;
import qwert9203.project_potato.init.ModArmor;
import qwert9203.project_potato.init.ModBlocks;
import qwert9203.project_potato.init.ModItems;
import qwert9203.project_potato.init.ModTools;
import qwert9203.project_potato.proxy.CommonProxy;

@Mod(modid = Reference.MODID ,name = Reference.NAME ,version = Reference.VERSION)
public class Project_potato {
	
	@Mod.Instance(Reference.MODID)
	public static Project_potato instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre Initialize");
		ModItems.init();
		ModTools.init();
		ModArmor.init();
		ModBlocks.init();
		ModItems.register();
		ModTools.register();
		ModArmor.register();
		ModBlocks.register();
		
		proxy.registerRenders();
		proxy.registerTileEntities();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Initialize");
		proxy.Init();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Initialize");
	}
}
