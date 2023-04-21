package io.github.Lgezy.datagen;

import io.github.Lgezy.blocks.AddBlocks;
import io.github.Lgezy.items.AddItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelDataGen extends FabricModelProvider {
    public ModModelDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(AddBlocks.AMBER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AddBlocks.AMBER_BLOCK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AddBlocks.DEEP_AMBER_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AddItems.AMBER, Models.GENERATED);//物品
        //itemModelGenerator.register(AddItems.AMBER, Models.HANDHELD);//武器

    }
}
