package qwert9203.project_potato.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class BlockBlockOfGabriel extends Block {

	public BlockBlockOfGabriel(String unLocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setHardness(20);
		this.setResistance(13);
		this.setHarvestLevel("axe", 0);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

}
