package dev.valhal4o1331.notenoughfeasts.world.gen;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModBushGeneration.generateBushes();
    }

    public static void registerModWorldGen() {
        generateModWorldGen();
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod World Gen...");
    }
}
