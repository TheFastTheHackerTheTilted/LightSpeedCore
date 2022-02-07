package net.onehorsepower.lightspeedcore;

import net.fabricmc.api.ModInitializer;
import net.onehorsepower.lightspeedcore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightSpeedCore implements ModInitializer {

	public static final String MOD_ID="lightspeedcore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID+" initialized!");
		ModItems.registerModItems();
	}
}
