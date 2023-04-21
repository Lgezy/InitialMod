package io.github.Lgezy;

import io.github.Lgezy.datagen.ModBlockLootTableDataGen;
import io.github.Lgezy.datagen.ModBlockTagDataGen;
import io.github.Lgezy.datagen.ModModelDataGen;
import io.github.Lgezy.datagen.ModRecipeDataGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenMain implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ModBlockLootTableDataGen::new);
        fabricDataGenerator.addProvider(ModModelDataGen::new);
        fabricDataGenerator.addProvider(ModRecipeDataGen::new);
        fabricDataGenerator.addProvider(ModBlockTagDataGen::new);

    }
}
