package dev.valhal4o1331.notenoughfeasts.util.items;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import dev.valhal4o1331.notenoughfeasts.item.ModItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class ModItemsComposting {

    public static void initCompostItems() {
        CompostingChanceRegistry.INSTANCE.add(ModItems.ONION, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.ONION_SEEDS, 0.25f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.ONION_ROOT, 0.15f);
    }

    public static void registerCompostItems() {
        initCompostItems();
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Compost Items...");
    }
}
