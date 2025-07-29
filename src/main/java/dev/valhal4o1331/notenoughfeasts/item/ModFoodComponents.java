package dev.valhal4o1331.notenoughfeasts.item;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent ONION = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .build();

    public static final FoodComponent ONION_ROOT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .build();

    public static final ConsumableComponent ONION_ROOT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200), 0.15f)).build();


    public static void registerModFoodComponents() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod Food Components...");
    }
}
