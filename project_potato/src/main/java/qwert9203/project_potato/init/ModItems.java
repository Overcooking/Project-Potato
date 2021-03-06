package qwert9203.project_potato.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.init.items.ItemCompressedPotato;
import qwert9203.project_potato.init.items.ItemPotatoEssence;

public class ModItems {
	
	public static Item CompressedPotato;
	public static Item PotatoEssence;

	public static void init( ) {
		CompressedPotato = new ItemCompressedPotato("compressed_potato", "compressed_potato");
		PotatoEssence = new ItemPotatoEssence("potato_essence", "potato_essence");
	}
	
	public static void register( ) {
		registerItem(CompressedPotato);
		registerItem(PotatoEssence);
	}
	
	public static void registerRenders() {
		registerRender(CompressedPotato);
		registerRender(PotatoEssence);
	}
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item: "+ item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
		
	}
	
}
