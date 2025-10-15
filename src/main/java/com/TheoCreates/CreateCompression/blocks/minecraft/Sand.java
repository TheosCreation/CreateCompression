package com.TheoCreates.CreateCompression.blocks.minecraft;


import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Sand extends FallingBlock {
    public static final MapCodec<Sand> CODEC = simpleCodec(Sand::new);

    public Sand(BlockBehaviour.Properties props) {
        super(props);
    }

    public static Sand create() {
        return new Sand(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(0.5F));
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}
