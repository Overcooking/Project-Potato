package qwert9203.project_potato.init.items;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(ToolMaterial material, String unLocalizedName) {
		super(material);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
	}

}
