package dev.valhal4o1331.notenoughfeasts.item;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NOT_ENOUGH_FEASTS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NotEnoughFeasts.MOD_ID, "not_enough_feasts_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.APPLE_PIE))
                    .displayName(Text.translatable("itemgroup.notenoughfeasts.not_enough_feasts_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.APPLE_PIE);
                        entries.add(ModItems.ONION);
                        entries.add(ModItems.ONION_SEEDS);
                        entries.add(ModItems.ONION_ROOT);
                    }).build());

    public static void registerItemGroups() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registering Mod Item Groups...");
    }

}
