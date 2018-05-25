package qwert9203.project_potato.init.items;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemModSword extends ItemSword{

	public ItemModSword(ToolMaterial material, String unLocalizedName) {
		super(material);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
	}

}
