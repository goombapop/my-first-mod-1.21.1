package net.rosiestsum.myfirstmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rosiestsum.myfirstmod.MyFirstMod;

public class ModTags {

    public static class Blocks {
        public static TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");
        public static TagKey<Block> INCORECT_FOR_PINK_GARNET_TOOL = createTag("incorect_for_pink_garnet_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MyFirstMod.MOD_ID, name));
        }
    }
    public static class Items{
            public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MyFirstMod.MOD_ID, name));
        }
    }
}
