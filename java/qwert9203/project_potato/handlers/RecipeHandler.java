package qwert9203.project_potato.handlers;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwert9203.project_potato.Utils;
import qwert9203.project_potato.init.ModArmor;
import qwert9203.project_potato.init.ModBlocks;
import qwert9203.project_potato.init.ModItems;
import qwert9203.project_potato.init.ModTools;

public class RecipeHandler {
	
	
	public static void registerCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.potato_block), new Object[] {"PPP", "PPP", "PPP", 'P', Items.POTATO });
		
		registerToolRecipes(ModTools.PotatoInfusedPickaxe, ModTools.PotatoInfusedAxe, ModTools.PotatoInfusedHoe, ModTools.PotatoInfusedShovel, ModTools.PotatoInfusedSword, ModItems.PotatoInfusedIngot);
		registerArmorRecipes(ModArmor.PotatoInfusedHelmet, ModArmor.PotatoInfusedChestplate, ModArmor.PotatoInfusedLeggings, ModArmor.PotatoInfusedBoots, ModItems.PotatoInfusedIngot, ModItems.PotatoInfusedIngot);
		
		Utils.getLogger().info("Registered Crafting Recipes!!!");
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ModBlocks.phosphorite_ore, new ItemStack(ModItems.Phosphorite, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.potatium_ore, new ItemStack(ModItems.PotatiumIngot, 3), 2.5F);
		GameRegistry.addSmelting(ModBlocks.gabrium_ore, new ItemStack(ModItems.GabriumIngot, 2), 12F);
		
		Utils.getLogger().info("Registered Smelting Recipes!!!");
	}
	
	private static void registerToolRecipes(Item pickaxe, Item axe, Item hoe, Item shovel, Item sword, Item material) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"III"," S "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {" II"," SI"," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"II ","IS "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"II "," S "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {" II"," S "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" I "," S "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"I  ","S  ","S  ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"  I","  S","  S", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" I "," I "," S ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"I  ","I  ","S  ", 'I', material, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"  I","  I","  S", 'I', material, 'S', Items.STICK });
	}
	
	private static void registerArmorRecipes(Item helmet, Item chestplate, Item leggings, Item boots, Item material, Item coreMaterial) {
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',material});
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',material});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","ICI","III",'I',material,'C',coreMaterial});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',material});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',material});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',material});
	}

}
