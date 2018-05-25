package qwert9203.project_potato.tilenetity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import qwert9203.project_potato.Utils;

public class TileEntityPotatoMasher extends TileEntity implements ITickable ,ICapabilityProvider{
	
	private int cooldown;
	private ItemStackHandler handler;
	
	public TileEntityPotatoMasher() {
		this.cooldown = 0;
		this.handler = new ItemStackHandler(1);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.cooldown = nbt.getInteger("Cooldown");
		super.readFromNBT(nbt);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("CoolDown", this.cooldown);
		return super.writeToNBT(nbt);
	}
	
	@Override
	public void update() {
		this.cooldown++;
		this.cooldown %= 100;
		Utils.getLogger().info("cooldowm " + this.cooldown);
	}
	
	
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return true;
		return super.hasCapability(capability, facing);
	}
}
