package net.joto.equicraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquiCraftMod implements ModInitializer {
	public static final String MOD_ID = "equicraft";

    public static final Logger LOGGER = LoggerFactory.getLogger("equicraft");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}