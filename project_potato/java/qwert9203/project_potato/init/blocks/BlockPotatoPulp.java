package qwert9203.project_potato.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import qwert9203.project_potato.Reference;

public class BlockPotatoPulp extends Block{

	public BlockPotatoPulp(String unLocalizedName, String registryName) {
		super(Material.SAND);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setHardness(2);
		this.setHarvestLevel("shovel", 1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
	

}
