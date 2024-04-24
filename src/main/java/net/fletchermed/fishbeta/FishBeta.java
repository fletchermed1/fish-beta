package net.fletchermed.fishbeta;

import net.fabricmc.api.ModInitializer;

import net.fletchermed.fishbeta.block.ModBlocks;
import net.fletchermed.fishbeta.item.ModItemGroups;
import net.fletchermed.fishbeta.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishBeta implements ModInitializer {
	public static final String MOD_ID = "fish-beta";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}