package io.github.Lgezy.items;

import io.github.Lgezy.Main;
import io.github.Lgezy.itemgroups.ItemGroupMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * 创建物品工具类
 */
public class ItemBeans {
    //封装添加物品公式(自主添加)1
    public static Item registerItem(String itemName,Item item){
        return Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,itemName),item);
    }
    //封装添加物品公式(添加到杂类)2
    //把物品封装自己的物品栏
    public static Item registerItem(String itemName){
        return Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,itemName),
                new Item(new FabricItemSettings().group(ItemGroupMain.INITIAL_ITEM)
                ));
    }



}
