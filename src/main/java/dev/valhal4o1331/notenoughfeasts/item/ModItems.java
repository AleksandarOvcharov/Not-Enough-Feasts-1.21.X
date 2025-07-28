package dev.valhal4o1331.notenoughfeasts.item;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new Item.Settings().food(ModFoodComponents.APPLE_PIE)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NotEnoughFeasts.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod Items...");
    }
}
