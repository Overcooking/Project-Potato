package qwert9203.project_potato.init.items;

import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(ToolMaterial material, String unLocalizedName) {
		super(material);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
	}

}
