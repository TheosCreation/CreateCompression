package com.TheoCreates.CreateCompression;

import com.TheoCreates.CreateCompression.blocks.cc.Nether_Star_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Refined_Radiance_Block;
import com.TheoCreates.CreateCompression.blocks.cc.Shadow_Steel_Block;
import com.google.common.collect.Lists;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public final class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(CreateCompression.MODID);
    public static final DeferredRegister.Items ITEMS =
        DeferredRegister.createItems(CreateCompression.MODID);
    public static final DeferredRegister<net.minecraft.world.item.CreativeModeTab> TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCompression.MODID);

    // keep handles you need
    private static final java.util.List<DeferredItem<? extends Item>> TAB_ITEMS = new java.util.ArrayList<>();

    public static void init() { /* nothing else needed; entrypoint registers the registers */ }

    private static void registerAll() {
        for (CreateCompressionType t : CreateCompressionType.VALUES) {
            for (int i = 1; i <= 9; i++) {
                String id = "compressed_" + t.name + "_" + i + "x";
                DeferredBlock<Block> b = BLOCKS.register(id, t.factory); // supplier ok :contentReference[oaicite:1]{index=1}
                DeferredItem<Item> it = ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties()));
                TAB_ITEMS.add(it);
            }
        }
        addSimple("nether_star_block", Nether_Star_Block::new);
        addSimple("refined_radiance_block", Refined_Radiance_Block::new);
        addSimple("shadow_steel_block", Shadow_Steel_Block::new);
    }

    private static void addSimple(String id, java.util.function.Supplier<? extends Block> sup) {
        var b = BLOCKS.register(id, sup);
        var it = ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties()));
        TAB_ITEMS.add(it);
    }

    static {
        registerAll();
        TABS.register("createcompression", () -> net.minecraft.world.item.CreativeModeTab.builder()
            .title(net.minecraft.network.chat.Component.translatable("itemGroup." + CreateCompression.MODID))
            .icon(() -> TAB_ITEMS.isEmpty() ? ItemStack.EMPTY : new ItemStack(TAB_ITEMS.get(0).get()))
            .displayItems((p, out) -> TAB_ITEMS.forEach(d -> out.accept(new ItemStack(d.get()))))
            .build());
    }
}
