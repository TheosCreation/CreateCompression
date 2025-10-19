package com.TheoCreates.CreateCompression.blocks.minecraft;


import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Red_Sand extends FallingBlock {
    public static final MapCodec<Red_Sand> CODEC = simpleCodec(Red_Sand::new);

    public Red_Sand(BlockBehaviour.Properties props) {
        super(props);
    }

    public static Red_Sand create() {
        return new Red_Sand(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(0.5F));
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}
