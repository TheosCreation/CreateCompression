package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Clay extends Block {
    public Clay() {
        super(Properties.copy(Blocks.CLAY)
            .sound(SoundType.GRAVEL)
            .strength(0.6f));
    }
}
