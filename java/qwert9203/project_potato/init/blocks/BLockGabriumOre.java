package qwert9203.project_potato.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class BLockGabriumOre extends Block{

	public BLockGabriumOre(String unLocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
		this.setHarvestLevel("hoe", 3);
		this.setHardness(17);
		this.setLightLevel(5);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
}
