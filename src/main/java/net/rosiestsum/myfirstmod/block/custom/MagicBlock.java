package net.rosiestsum.myfirstmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.rosiestsum.myfirstmod.block.ModBlocks;
import net.rosiestsum.myfirstmod.item.ModItems;

import java.util.List;

public class MagicBlock extends Block {
    public MagicBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                                 BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 5f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity){
            if (itemEntity.getStack().getItem() == ModBlocks.PINK_GARNET_BLOCK.asItem()){
                itemEntity.setStack(new ItemStack(ModBlocks.RAW_PINK_GARNET_BLOCK.asItem(), itemEntity.getStack().getCount()));
            }
            else if (itemEntity.getStack().getItem() == ModItems.PINK_GARNET){
                itemEntity.setStack(new ItemStack(ModItems.RAW_PINK_GARNET, itemEntity.getStack().getCount()));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.myfirstmod.magic_block.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
