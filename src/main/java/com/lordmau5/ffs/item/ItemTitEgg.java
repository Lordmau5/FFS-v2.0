package com.lordmau5.ffs.item;

import com.lordmau5.ffs.holder.ModCreativeTab;
import net.minecraft.world.item.Item;

public class ItemTitEgg extends Item {
    public ItemTitEgg(final Item.Properties properties) {
        super(properties.tab(ModCreativeTab.instance));
    }

}
