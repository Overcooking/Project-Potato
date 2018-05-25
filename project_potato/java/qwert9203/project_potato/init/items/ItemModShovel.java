package qwert9203.project_potato.init.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemModShovel extends ItemSpade{

	public ItemModShovel(ToolMaterial material, String unLocalizedName) {
		super(material);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
	}

}
