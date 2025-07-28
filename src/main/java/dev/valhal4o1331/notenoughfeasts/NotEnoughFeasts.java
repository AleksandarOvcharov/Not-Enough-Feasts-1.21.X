package dev.valhal4o1331.notenoughfeasts;

import dev.valhal4o1331.notenoughfeasts.item.ModFoodComponents;
import dev.valhal4o1331.notenoughfeasts.item.ModItemGroups;
import dev.valhal4o1331.notenoughfeasts.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughFeasts implements ModInitializer {
	public static final String MOD_ID = "notenoughfeasts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[NotEnoughFeasts] Mod Initializing...");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModFoodComponents.registerModFoodComponents();
		LOGGER.info("[NotEnoughFeasts] Mod Initialized!");
	}
}