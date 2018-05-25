package qwert9203.project_potato.init;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.init.items.FuelHandler;
import qwert9203.project_potato.init.items.ItemCompressedPotato;
import qwert9203.project_potato.init.items.ItemModFood;
import qwert9203.project_potato.init.items.ItemPhosphorite;
import qwert9203.project_potato.init.items.ItemPotatoEssence;
import qwert9203.project_potato.init.items.ItemPotatoInfusedIngot;

public class ModItems {
	
	public static Item CompressedPotato;
	public static Item PotatoEssence;
	public static Item Phosphorite;
	public static Item PotatoPave;
	public static Item PhosphorusPentoxide;
	public static Item PotatoInfusedIngot;

	public static void init( ) {
		//normal items initialization
		CompressedPotato = new ItemCompressedPotato("compressed_potato", "compressed_potato");
		PotatoEssence = new ItemPotatoEssence("potato_essence", "potato_essence");
		Phosphorite = new ItemPhosphorite("phosphorite", "phosphorite");
		PotatoInfusedIngot = new ItemPotatoInfusedIngot("potato_infused_ingot", "potato_infused_ingot");
		//food initialization
		PotatoPave = new ItemModFood("potato_pave", 13, 17, true);
		//fuel initialization
		PhosphorusPentoxide = new Item().setUnlocalizedName("phosphorus_pentoxide").setRegistryName(new ResourceLocation(Reference.MODID, "phosphorus_pentoxide"));
		
	}
	
	public static void register( ) {
		registerItem(CompressedPotato);
		registerItem(PotatoEssence);
		registerItem(Phosphorite);
		registerItem(PotatoPave);
		registerItem(PhosphorusPentoxide);
		registerItem(PotatoInfusedIngot);
	}
	
	public static void registerRenders() {
		registerRender(CompressedPotato);
		registerRender(PotatoEssence);
		registerRender(Phosphorite);
		registerRender(PotatoPave);
		registerRender(PhosphorusPentoxide);
		registerRender(PotatoInfusedIngot);
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
