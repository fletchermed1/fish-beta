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
    public static final Block BLACK_GLOWSTONE = registerBlock("black_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block BROWN_GLOWSTONE = registerBlock("brown_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block CYAN_GLOWSTONE = registerBlock("cyan_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block DARK_GRAY_GLOWSTONE = registerBlock("dark_gray_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block GREEN_GLOWSTONE = registerBlock("green_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block LIGHT_BLUE_GLOWSTONE = registerBlock("light_blue_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block LIGHT_GRAY_GLOWSTONE = registerBlock("light_gray_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block MAGENTA_GLOWSTONE = registerBlock("magenta_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block ORANGE_GLOWSTONE = registerBlock("orange_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block PINK_GLOWSTONE = registerBlock("pink_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block PURPLE_GLOWSTONE = registerBlock("purple_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block YELLOW_GLOWSTONE = registerBlock("yellow_glowstone",
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
