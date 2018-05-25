package qwert9203.project_potato.init.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import qwert9203.project_potato.Reference;
import qwert9203.project_potato.handlers.EnumHandler.Tier;
import qwert9203.project_potato.init.blocks.item.IMetaBlockName;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;

public class BlockAltarCore extends Block implements IMetaBlockName, ITileEntityProvider {
	
	public static final PropertyEnum TIER = PropertyEnum.create("tier", Tier.class);

	public BlockAltarCore(String unLocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
		this.setDefaultState(this.blockState.getBaseState().withProperty(TIER, Tier.ZERO));
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityAltarCore();
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TIER});
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		Tier tier = (Tier) state.getValue(TIER);
		return tier.getTier();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TIER, Tier.values()[meta]);
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < Tier.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return Tier.values()[stack.getItemDamage()].getName();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityAltarCore();
	}
	

}
