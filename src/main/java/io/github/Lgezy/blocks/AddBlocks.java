package io.github.Lgezy.blocks;

import io.github.Lgezy.Main;
import net.minecraft.block.Block;

public class AddBlocks {
    public static final Block AMBER_BLOCK = BlockBeans.purificationBlock("amber_block");
    public static final Block DEEP_AMBER_ORE = BlockBeans.registerBlock("deep_amber_ore");
    public static final Block AMBER_BLOCK_ORE = BlockBeans.registerDeepBlock("amber_block_ore");











    public static void registerBlocks(){
        Main.LOGGER.debug(Main.MOD_ID+"正在注册方块");
    }
}
