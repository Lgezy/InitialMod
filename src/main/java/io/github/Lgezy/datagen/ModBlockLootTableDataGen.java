package io.github.Lgezy.datagen;

import io.github.Lgezy.Main;
import io.github.Lgezy.blocks.AddBlocks;
import io.github.Lgezy.items.AddItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.awt.event.ItemEvent;
import java.util.function.BiConsumer;

public class ModBlockLootTableDataGen extends SimpleFabricLootTableProvider {

    public ModBlockLootTableDataGen(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator, LootContextTypes.BLOCK);
    }
    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer)
    {
        identifierBuilderBiConsumer.accept(
                new Identifier(Main.MOD_ID,"blocks/amber_block"),
                BlockLootTableGenerator.drops(AddBlocks.AMBER_BLOCK));

        identifierBuilderBiConsumer.accept(
                new Identifier(Main.MOD_ID,"blocks/amber_block_ore"),
                BlockLootTableGenerator.oreDrops(AddBlocks.AMBER_BLOCK_ORE,AddItems.AMBER));

        //深层矿石
        identifierBuilderBiConsumer.accept(new Identifier(Main.MOD_ID,"blocks/deep_amber_ore"),
                BlockLootTableGenerator.dropsWithSilkTouch(
                        AddBlocks.DEEP_AMBER_ORE,
                        BlockLootTableGenerator.applyExplosionDecay(
                                AddBlocks.DEEP_AMBER_ORE,
                                (ItemEntry
                                        .builder(AddItems.AMBER)
                                        .apply(SetCountLootFunction
                                                .builder(UniformLootNumberProvider
                                                        .create(1.0f,2.0f))))
                                        .apply(ApplyBonusLootFunction
                                                .oreDrops(Enchantments.FORTUNE)))));

    }
}
