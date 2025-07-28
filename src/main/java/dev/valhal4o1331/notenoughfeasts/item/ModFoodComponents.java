package dev.valhal4o1331.notenoughfeasts.item;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent ONION = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .build();


    public static void registerModFoodComponents() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod Food Components...");
    }
}
