package qwert9203.project_potato.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AttachCapabilitiesEvent.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import qwert9203.project_potato.container.slots.SlotAltarCore;
import qwert9203.project_potato.tilenetity.TileEntityAltarCore;

public class ContainerAltarCore extends Container{
//	private static final Side Client = null;
	private TileEntityAltarCore te;
	IItemHandler handler;
	
	public ContainerAltarCore(IInventory playersInventory, TileEntityAltarCore te) {
		this.te = te;
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		this.addSlotToContainer(new SlotAltarCore(handler, 0, 84, 35));

		
		
		int xPos = 8;
		int yPos = 84;
				
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playersInventory, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}
				
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playersInventory, x, xPos + x * 18, yPos + 58));
		}
	}
	


	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return !player.isSpectator();
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = (ItemStack)null;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < 1) {
	            // From the block breaker inventory to player's inventory
	            if (!this.mergeItemStack(current, 1, 37, true))
	                return (ItemStack)null;
	        } else {
	            // From the player's inventory to block breaker's inventory
	            if (!this.mergeItemStack(current, 0, 1, false))
	                return (ItemStack)null;
	        }

	        if (current.stackSize == 0) //Use func_190916_E() instead of stackSize 1.11 only 1.11.2 use getCount()
	            slot.putStack((ItemStack)null); //Use ItemStack.field_190927_a instead of (ItemStack)null for a blank item stack. In 1.11.2 use ItemStack.EMPTY
	        else
	            slot.onSlotChanged();

	        if (current.stackSize == previous.stackSize)
	            return null;
	         slot.onPickupFromSlot(playerIn, current);
	    }
	    return previous;
	}


}
