package net.fletchermed.fishbeta.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fletchermed.fishbeta.FishBeta;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WHITE_GLOWSTONE = registerBlock("white_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block RED_GLOWSTONE = registerBlock("red_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block BlUE_GLOWSTONE = registerBlock("blue_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block LIME_GLOWSTONE = registerBlock("lime_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FishBeta.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FishBeta.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        FishBeta.LOGGER.info("Registering Mod Blocks for " + FishBeta.MOD_ID);
    }
}
