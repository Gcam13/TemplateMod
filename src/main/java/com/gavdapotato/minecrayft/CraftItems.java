package com.gavdapotato.minecrayft;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CraftItems {
    //Create DeferredRegister for items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MineCrayft.MODID);

    //Register Items
    public static final RegistryObject<Item> SHRIMP = ITEMS.register(
            "shrimp",
            () -> new Item(new Item.Properties()));

    //Registration methods
    static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
