package io.github.Lgezy.items;

import io.github.Lgezy.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InsertItems {
    public static final Item AMBER = Registry.register(Registry.ITEM,
            new Identifier(Main.MOD_ID,
                    "amber"),
            new Item(new FabricItemSettings().group(ItemGroup.MISC)
            ));

    public static void registerItems(){
        Main.LOGGER.debug(Main.MOD_ID+"正在注册物品");
    }
}
