package net.rosiestsum.myfirstmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.rosiestsum.myfirstmod.block.ModBlocks;
import net.rosiestsum.myfirstmod.component.ModDataComponentTypes;
import net.rosiestsum.myfirstmod.item.ModItemGroups;
import net.rosiestsum.myfirstmod.item.ModItems;
import net.rosiestsum.myfirstmod.util.HammerUsageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstMod implements ModInitializer {
	public static final String MOD_ID = "myfirstmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentTypes();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}