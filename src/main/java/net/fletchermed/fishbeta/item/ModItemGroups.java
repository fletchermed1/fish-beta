package net.fletchermed.fishbeta.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fletchermed.fishbeta.FishBeta;
import net.fletchermed.fishbeta.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FISH_BETA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FishBeta.MOD_ID, "test"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fishbeta"))
                    .icon(() -> new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST);
                        entries.add(ModBlocks.WHITE_GLOWSTONE);
                        entries.add(ModBlocks.RED_GLOWSTONE);
                        entries.add(ModBlocks.BlUE_GLOWSTONE);
                        entries.add(ModBlocks.LIME_GLOWSTONE);
                        entries.add(ModBlocks.BLACK_GLOWSTONE);
                        entries.add(ModBlocks.BROWN_GLOWSTONE);
                        entries.add(ModBlocks.CYAN_GLOWSTONE);
                        entries.add(ModBlocks.DARK_GRAY_GLOWSTONE);
                        entries.add(ModBlocks.GREEN_GLOWSTONE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLOWSTONE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLOWSTONE);
                        entries.add(ModBlocks.MAGENTA_GLOWSTONE);
                        entries.add(ModBlocks.ORANGE_GLOWSTONE);
                        entries.add(ModBlocks.PINK_GLOWSTONE);
                        entries.add(ModBlocks.PURPLE_GLOWSTONE);
                        entries.add(ModBlocks.YELLOW_GLOWSTONE);
                    }).build());

    public static void registerItemGroups() {
        FishBeta.LOGGER.info("Registering Item Groups for " + FishBeta.MOD_ID);
    }
}
