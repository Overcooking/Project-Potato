package qwert9203.project_potato.tilenetity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import qwert9203.project_potato.Utils;

public class TileEntityAltarCore extends TileEntity implements ITickable{
	
	private int tier;
	private int cooldown;
	
	public TileEntityAltarCore() {
		this.tier = 0;
		this.cooldown = 0;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.tier = nbt.getInteger("tier");
		this.cooldown = nbt.getInteger("cooldown");
		super.readFromNBT(nbt);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("tier", this.tier);
		nbt.setInteger("cooldown", this.cooldown);
		return super.writeToNBT(nbt);
	}

	@Override
	public void update() {
		this.cooldown++;
		this.cooldown %= 100;
		Utils.getLogger().info("cooldown: "+ this.cooldown);
	}
	

}
