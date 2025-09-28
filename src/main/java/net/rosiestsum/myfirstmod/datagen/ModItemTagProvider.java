package net.rosiestsum.myfirstmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.rosiestsum.myfirstmod.block.ModBlocks;
import net.rosiestsum.myfirstmod.item.ModItems;
import net.rosiestsum.myfirstmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.CHISEL)
                .add(ModBlocks.MAGIC_BLOCK.asItem())
                .add(Blocks.DIAMOND_BLOCK.asItem());
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PINK_GARNET_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PINK_GARNET_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PINK_GARNET_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PINK_GARNET_PICKAXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PINK_GARNET_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS);
    }
}
