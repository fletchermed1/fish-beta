package net.fletchermed.fishbeta;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishBeta implements ModInitializer {
	public static final String MOD_ID = "fish-beta";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		LOGGER.info("Fish Beta has been loaded");
	}
}