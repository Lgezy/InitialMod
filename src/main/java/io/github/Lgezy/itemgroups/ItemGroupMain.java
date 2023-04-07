package io.github.Lgezy.itemgroups;

import io.github.Lgezy.Main;
import io.github.Lgezy.blocks.AddBlocks;
import io.github.Lgezy.items.AddItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupMain {
    public static final ItemGroup INITIAL_ITEM = FabricItemGroupBuilder
            .build(new Identifier(Main.MOD_ID,"initial_item"),
                    ()->new ItemStack(AddItems.AMBER));

    public static final ItemGroup INITIAL_BLOCK = FabricItemGroupBuilder
            .build(new Identifier(Main.MOD_ID,"initial_block"),
                    ()->new ItemStack(AddBlocks.AMBER_BLOCK_ORE));
}
