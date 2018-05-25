package qwert9203.project_potato.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.init.items.ItemModAxe;
import qwert9203.project_potato.init.items.ItemModHoe;
import qwert9203.project_potato.init.items.ItemModPickaxe;
import qwert9203.project_potato.init.items.ItemModShovel;
import qwert9203.project_potato.init.items.ItemModSword;

public class ModTools {
	
	public static final ToolMaterial PotatoInfusedMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":potato_infused", 3, 1337, 7.5F, 3.5F, 18);
	public static final ToolMaterial PhospholipidMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":phospholipid", 3, 86886, 21F, 18F, 29);
	
	public static ItemPickaxe PotatoInfusedPickaxe;
	public static ItemModAxe PotatoInfusedAxe;
	public static ItemHoe PotatoInfusedHoe;
	public static ItemSpade PotatoInfusedShovel;
	public static ItemSword PotatoInfusedSword;
	
	public static ItemPickaxe PhospholipidPickaxe;
	public static ItemModAxe PhospholipidAxe;
	public static ItemHoe PhospholipidHoe;
	public static ItemSpade PhospholipidShovel;
	public static ItemSword PhospholipidSword;


	
	
	public static void init() {
		PotatoInfusedPickaxe = new ItemModPickaxe(PotatoInfusedMaterial,"potato_infused_pickaxe");
		PotatoInfusedAxe = new ItemModAxe(PotatoInfusedMaterial,"potato_infused_axe");
		PotatoInfusedHoe = new ItemModHoe(PotatoInfusedMaterial, "potato_infused_hoe");
		PotatoInfusedShovel = new ItemModShovel(PotatoInfusedMaterial, "potato_infused_shovel");
		PotatoInfusedSword = new ItemModSword(PotatoInfusedMaterial, "potato_infused_sword");
		
		PhospholipidPickaxe = new ItemModPickaxe(PhospholipidMaterial,"phospholipid_pickaxe");
		PhospholipidAxe = new ItemModAxe(PhospholipidMaterial,"phospholipid_axe");
		PhospholipidHoe = new ItemModHoe(PhospholipidMaterial, "phospholipid_hoe");
		PhospholipidShovel = new ItemModShovel(PhospholipidMaterial, "phospholipid_shovel");
		PhospholipidSword = new ItemModSword(PhospholipidMaterial, "phospholipid_sword");
		
		
	}
	
	public static void register() {
		registerItem(PotatoInfusedPickaxe);
		registerItem(PotatoInfusedAxe);
		registerItem(PotatoInfusedHoe);
		registerItem(PotatoInfusedShovel);
		registerItem(PotatoInfusedSword);
		
		registerItem(PhospholipidPickaxe);
		registerItem(PhospholipidAxe);
		registerItem(PhospholipidHoe);
		registerItem(PhospholipidShovel);
		registerItem(PhospholipidSword);
		
		
	}
	
	public static void registerRenders() {
		registerRender(PotatoInfusedPickaxe);
		registerRender(PotatoInfusedAxe);
		registerRender(PotatoInfusedHoe);
		registerRender(PotatoInfusedShovel);
		registerRender(PotatoInfusedSword);
		
		registerRender(PhospholipidPickaxe);
		registerRender(PhospholipidAxe);
		registerRender(PhospholipidHoe);
		registerRender(PhospholipidShovel);
		registerRender(PhospholipidSword);
		
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
