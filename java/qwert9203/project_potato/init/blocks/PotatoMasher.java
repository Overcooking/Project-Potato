package qwert9203.project_potato.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;
import qwert9203.project_potato.tilenetity.TileEntityPotatoMasher;

public class PotatoMasher extends Block implements ITileEntityProvider{

	public PotatoMasher(String unlocalizedName) {
		super(Material.ANVIL);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setHardness(8);
		this.setHarvestLevel("pickaxe", 2);
		this.setDefaultState(this.blockState.getBaseState());
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityPotatoMasher();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityPotatoMasher();
	}

}
