package qwert9203.project_potato.init;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.handlers.EnumHandler;
import qwert9203.project_potato.init.blocks.BlockAltarCore;
import qwert9203.project_potato.init.blocks.BlockBlockOfGabriel;
import qwert9203.project_potato.init.blocks.BlockGraphiteOre;
import qwert9203.project_potato.init.blocks.BlockPhosphoriteOre;
import qwert9203.project_potato.init.blocks.BlockPotatoBlock;
import qwert9203.project_potato.init.blocks.BlockPotatoPulp;
import qwert9203.project_potato.init.blocks.item.ItemAltarCore;

public class ModBlocks {
	
	
	public static Block potato_pulp;
	public static Block potato_block;
	public static Block block_of_gabriel;
	public static Block phosphorite_ore;
	public static Block graphite_ore;
	public static Block altar_core;
	
	
	public static void init() {
		potato_block = new BlockPotatoBlock("potato_block", "potato_block");
		block_of_gabriel = new BlockBlockOfGabriel("block_of_gabriel", "block_of_gabriel");
		potato_pulp = new BlockPotatoPulp("potato_pulp", "potato_pulp");
		phosphorite_ore = new BlockPhosphoriteOre("phosphorite_ore", "phosphorite_ore");
		graphite_ore = new BlockGraphiteOre("graphite_ore", "graphite_ore");
		altar_core = new BlockAltarCore("altar_core");
		
	}
	
	public static void register() {
		registerBlock(potato_block);
		registerBlock(block_of_gabriel);
		registerBlock(potato_pulp);
		registerBlock(phosphorite_ore);
		registerBlock(graphite_ore);
		registerBlock(altar_core, new ItemAltarCore(altar_core));
	}
	

	
	public static void registerRenders() {
		registerRender(potato_block);
		registerRender(block_of_gabriel);
		registerRender(potato_pulp);
		registerRender(phosphorite_ore);
		registerRender(graphite_ore);
		
		
		for(int i = 0; i < EnumHandler.Tier.values().length; i++) {
			registerRender(altar_core, i, "altar_core_" +EnumHandler.Tier.values()[i].getName());
		}
	}
	
	
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("registered block: " + block.getUnlocalizedName().substring(5));
	}
		
		
	public static void registerBlock(Block block) { 
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("registered block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		Utils.getLogger().info("Registered render for" + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("registered render for " + block.getUnlocalizedName().substring(5));		
	}
	
}
