package qwert9203.project_potato.init.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemGabriumIngot extends Item{
	
	public ItemGabriumIngot(String unLocalizedName) {
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unLocalizedName));
	}

}
