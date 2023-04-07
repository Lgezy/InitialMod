package io.github.Lgezy.items;

import io.github.Lgezy.Main;
import net.minecraft.item.Item;


/**
 * 注册物品类
 */
public class AddItems {
    public static final Item AMBER = ItemBeans.registerItem("amber");











    public static void insertItems(){
        Main.LOGGER.debug(Main.MOD_ID+"正在注册物品");
    }
}
