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
import qwert9203.project_potato.init.blocks.BlockBlockOfGabriel;
import qwert9203.project_potato.init.blocks.BlockPotatoBlock;

public class ModBlocks {
	public static Block potato_block;
	public static Block block_of_gabriel;
	public static void init() {
		potato_block = new BlockPotatoBlock("potato_block", "potato_block");
		block_of_gabriel = new BlockBlockOfGabriel("block_of_gabriel", "block_of_gabriel");
		
	}
	
	public static void register() {
		registerBlock(potato_block);
		registerBlock(block_of_gabriel);
		
	}
	
	public static void registerRenders() {
		registerRender(potato_block);
		registerRender(block_of_gabriel);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("registered block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("registered render for " + block.getUnlocalizedName().substring(5));
	}
	
}
