package com.deemers.behgameontweaks.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;

public class BaublesNecklaceItem extends ItemBase implements IBauble {

	public BaublesNecklaceItem(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

}