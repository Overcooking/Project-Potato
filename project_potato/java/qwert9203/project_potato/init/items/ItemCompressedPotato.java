package qwert9203.project_potato.init.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwert9203.project_potato.Reference;

public class ItemCompressedPotato extends Item{
	
	public ItemCompressedPotato(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}
