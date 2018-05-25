package qwert9203.project_potato.proxy;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.init.ModArmor;
import qwert9203.project_potato.init.ModBlocks;
import qwert9203.project_potato.init.ModItems;
import qwert9203.project_potato.init.ModTools;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
	}
	
	public void registerModelBakeryStuff() {
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.altar_core), new ResourceLocation(Reference.MODID, "altar_core_tier0"), new ResourceLocation(Reference.MODID, "altar_core_tier1"), new ResourceLocation(Reference.MODID, "altar_core_tier2"));
	}
	
}
