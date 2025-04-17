package net.maque.bonemod;

import net.fabricmc.api.ModInitializer;

import net.maque.bonemod.block.ModBlocks;
import net.maque.bonemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bonemod implements ModInitializer {
	public static final String MOD_ID = "bonemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}