package io.github.Lgezy.blocks;

import io.github.Lgezy.Main;
import io.github.Lgezy.itemgroups.ItemGroupMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;


public class BlockBeans {


    /**
     * 简化开发 1.0，还是比较麻烦
     * @param blockName 方块名字
     * @param block 方块状态
     * @param itemGroup 物品栏
     * @return
     */
    public static Block registerBlock(String blockName,Block block,ItemGroup itemGroup){
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,new FabricItemSettings().group(itemGroup)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),
                block);
    }

    /**
     * 简化开发 1.1，建议使用
     * @param blockName 方块名字
     * @param block 方块状态
     * @return
     */
    public static Block registerBlock(String blockName,Block block){
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),
                block);
    }

    /**
     * 简化开发 1.2，不完善禁用
     * @param blockName 方块名字
     * @param material 方块材质
     * @return
     */
    public static Block registerBlock(String blockName,Material material){
       Block block =  new Block(FabricBlockSettings.of(material));
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.MISC)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }

    /**
     * 简化开发 1.3，完善 可使用
     * @param blockName 方块名字
     * @return
     */
    public static Block registerBlock(String blockName){
        Block block =  new OreBlock(FabricBlockSettings.of(Material.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(4.5f)
                //掉落经验
                , UniformIntProvider.create(1,2)

        );
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }

    /**
     * 简化开发之深层 1.0  完善 可使用
     * @param blockName 方块名字
     * @return
     */
    public static Block registerDeepBlock(String blockName){
        Block block =  new OreBlock(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(4.5f)
                //掉落经验
                , UniformIntProvider.create(2,3)
        );

        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }

    /**
     * 建议提纯方块使用
     * @param blockName 方块名字
     * @return
     */
    public static Block purificationBlock(String blockName){
        Block block =  new Block(FabricBlockSettings.of(Material.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .strength(6.0f)
        );
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroupMain.INITIAL_BLOCK)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }











    //以下测试
    /*public static Block registerBlock(String blockName,Material material){
        Block block =  new Block(FabricBlockSettings.of(material)
                //强度
                .strength(1.0f,2.0f)
                //破坏时声音
                .sounds(BlockSoundGroup.METAL)
                //跳跃时速度倍增
                .jumpVelocityMultiplier(1.0f)
                //速度倍增
                .velocityMultiplier(2.0f)
                //方块亮度
                .luminance(2)
                //方块的光滑度
                .slipperiness(1.0f)
                //方块的颜色
                .mapColor(DyeColor.YELLOW)
                //无任何掉落物
                .dropsNothing()
                //隐形方块
                .air()
                //草材质可瞬间破坏
                .breakInstantly()
                //渲染方式，用于不完整方块渲染
                .nonOpaque()
                //没有碰撞箱
                .noCollision()
                //是否让窒息
                .suffocates()
                //是否能在这上面生物生成
                .allowsSpawning()
        );
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID,blockName),
                new BlockItem(block,
                        new FabricItemSettings().group(ItemGroup.MISC)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID,blockName),block);
    }*/




}
