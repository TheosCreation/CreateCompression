package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class Glass extends Block {
    public Glass() {
        super(Properties.of(Material.GLASS)
            .sound(SoundType.GLASS)
            .strength(0.3f)
            .noOcclusion());
    }
}
