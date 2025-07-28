package dev.valhal4o1331.notenoughfeasts.item;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import dev.valhal4o1331.notenoughfeasts.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotEnoughFeasts.MOD_ID,
                    "apple_pie")))
            .food(ModFoodComponents.APPLE_PIE)));

    public static final Item ONION = registerItem("onion", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotEnoughFeasts.MOD_ID,
                    "onion")))
            .food(ModFoodComponents.ONION)));

    public static final Item ONION_SEEDS = registerItem("onion_seeds",
            new ModSeedItem(ModBlocks.ONION_CROP, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NotEnoughFeasts.MOD_ID,
                            "onion_seeds")))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NotEnoughFeasts.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod Items...");
    }
}
