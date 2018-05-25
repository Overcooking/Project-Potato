package qwert9203.project_potato.init.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import qwert9203.project_potato.init.ModItems;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.PhosphorusPentoxide)
			return 1200;
		if(fuel.getItem() == ModItems.Phosphorite)
			return 800;
		return 0;
	}
}
