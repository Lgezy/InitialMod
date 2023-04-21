package io.github.Lgezy.datagen;

import io.github.Lgezy.blocks.AddBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlockTagDataGen extends FabricTagProvider<Block> {

    public ModBlockTagDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK,"");
    }

    @Override
    public void generateTags() {
        getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY,new Identifier("minecraft","needs_iron_tool")))
                .add(AddBlocks.AMBER_BLOCK_ORE)
                .add(AddBlocks.DEEP_AMBER_ORE)
                .add(AddBlocks.AMBER_BLOCK);
        getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY,new Identifier("minecraft","mineable/pickaxe")))
                .add(AddBlocks.AMBER_BLOCK_ORE)
                .add(AddBlocks.DEEP_AMBER_ORE)
                .add(AddBlocks.AMBER_BLOCK);

    }
}
