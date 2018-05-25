package qwert9203.project_potato.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum Tier implements IStringSerializable {
		ZERO("null", 0),
		ONE("potato_infused", 1),
		TWO("phospholipid", 2);
		
		private int tier;
		private String name;
		
		private Tier(String name, int tier) {
			this.tier = tier;
			this.name = name;
		}
		

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getTier() {
			return tier;
	}
		@Override
		public String toString() {
			return getName();
		}
	}
}
