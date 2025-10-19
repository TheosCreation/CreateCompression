package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class Redstone extends Block {
    public Redstone() {
        super(Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0F, 6.0F));
    }

    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction side) {
        return 15;
    }

    @Override
    public int getDirectSignal(BlockState state, BlockGetter level, BlockPos pos, Direction side) {
        return 15;
    }
}
