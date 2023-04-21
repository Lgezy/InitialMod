package io.github.Lgezy.datagen;

import io.github.Lgezy.blocks.AddBlocks;
import io.github.Lgezy.items.AddItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeDataGen extends FabricRecipeProvider {
    public ModRecipeDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter,
                List.of(AddBlocks.AMBER_BLOCK_ORE,AddBlocks.DEEP_AMBER_ORE),
                AddItems.AMBER,1f,200,"initial_block");
        offerBlasting(exporter,
                List.of(AddBlocks.AMBER_BLOCK_ORE,AddBlocks.DEEP_AMBER_ORE),
                AddItems.AMBER,1f,100,"initial_block");

        offerReversibleCompactingRecipes(exporter,
                AddItems.AMBER,
                AddBlocks.AMBER_BLOCK_ORE,
                "amber_block_ore_form_amber",
                null,
                "amber_form_amber_block_ore",
                null
                );
        offerReversibleCompactingRecipes(exporter,
                AddItems.AMBER,
                AddBlocks.DEEP_AMBER_ORE,
                "deep_block_ore_form_amber",
                null,
                "amber_form_deep_block_ore",
                null
        );

        ShapedRecipeJsonBuilder.create(AddBlocks.AMBER_BLOCK)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A',AddItems.AMBER)
                .criterion(RecipeProvider.hasItem(AddItems.AMBER),
                        RecipeProvider.conditionsFromItem(AddItems.AMBER))
                .offerTo(exporter);
    }
}
