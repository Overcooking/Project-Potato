package qwert9203.project_potato.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import qwert9203.project_potato.Reference;

public class ItemModFood extends ItemFood{


	private PotionEffect[] effects;
	
	
	public ItemModFood(String unlocalizedName, int amount, boolean isWolfFood, PotionEffect...potionEffects) {
		super(amount, isWolfFood);
		this.effects = potionEffects;
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	

	public ItemModFood(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect...potionEffects) {
		super(amount, saturation, isWolfFood);
		this.effects = potionEffects;
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		for(PotionEffect effect : effects) {
			player.addPotionEffect(effect);
		}
	}
}
