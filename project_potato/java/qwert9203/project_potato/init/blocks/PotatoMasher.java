package qwert9203.project_potato.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class PotatoMasher extends Block{
	
	//public static final PropertyEnum TYPE = PropertyEnum.create("type", ChipTypes.class);

	public PotatoMasher(String unLocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
		//this.setDefaultState(this.blockstate.getBaseState().withProperty(TYPE, ChipTypes.BASIC));
	}
	
//	@Override
	//protected BlockStateContainer createBlockState() {
	//	return new BlockStateContainer(this, new IProperty[] {TYPE});
//	}

}
