package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Glass extends Block {
    public Glass() {
        super(Properties.of(Material.GLASS)
            .sound(SoundType.GLASS)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f))
            .noOcclusion();
    }
    @Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
