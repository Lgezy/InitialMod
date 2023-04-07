package io.github.Lgezy.blocks;

import io.github.Lgezy.Main;
import io.github.Lgezy.itemgroups.ItemGroupMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlockBeans {


    //封装注册方块方法
    public static Block registerBlock(String blockName,Block block,ItemGroup itemGroup){
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,new FabricItemSettings().group(itemGroup)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),
                block);
    }
    //封装优化拆分
    public static Block registerBlock(String blockName,Material material){
       Block block =  new Block(FabricBlockSettings.of(material));
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.MISC)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }
    //封装最终版
    public static Block registerBlock(String blockName){
        Block block =  new Block(FabricBlockSettings.of(Material.METAL)
                .requiresTool().strength(3f)
                .sounds(BlockSoundGroup.METAL));

        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }
    //深层矿石
    public static Block registerDeepBlock(String blockName){
        Block block =  new Block(FabricBlockSettings.of(Material.STONE)
                .requiresTool().strength(3f)
                .sounds(BlockSoundGroup.DEEPSLATE));

        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }





}
