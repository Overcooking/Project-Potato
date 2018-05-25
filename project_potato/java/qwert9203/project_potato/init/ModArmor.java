package qwert9203.project_potato.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.init.items.ItemModArmor;

public class ModArmor {
	
	public static ArmorMaterial PotatoInfusedMaterial = EnumHelper.addArmorMaterial("potato_infused", Reference.MODID + ":potato_infused", 29, new int[] {3,6,5,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.5F);
	
	public static ItemArmor PotatoInfusedHelmet;
	public static ItemArmor PotatoInfusedChestplate;
	public static ItemArmor PotatoInfusedLeggings;
	public static ItemArmor PotatoInfusedBoots;
	
	public static void init() {
		PotatoInfusedHelmet = new ItemModArmor(PotatoInfusedMaterial, 1, EntityEquipmentSlot.HEAD, "potato_infused_helmet");
		PotatoInfusedChestplate = new ItemModArmor(PotatoInfusedMaterial, 1, EntityEquipmentSlot.CHEST, "potato_infused_chestplate");
		PotatoInfusedLeggings = new ItemModArmor(PotatoInfusedMaterial, 2, EntityEquipmentSlot.LEGS, "potato_infused_leggings");
		PotatoInfusedBoots = new ItemModArmor(PotatoInfusedMaterial, 1, EntityEquipmentSlot.FEET, "potato_infused_boots");
			
	}
	
	public static void register() {
		registerItem(PotatoInfusedHelmet);
		registerItem(PotatoInfusedChestplate);
		registerItem(PotatoInfusedLeggings);
		registerItem(PotatoInfusedBoots);
	}
	
	public static void registerRenders() {
		registerRender(PotatoInfusedHelmet);
		registerRender(PotatoInfusedChestplate);
		registerRender(PotatoInfusedLeggings);
		registerRender(PotatoInfusedBoots);
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
