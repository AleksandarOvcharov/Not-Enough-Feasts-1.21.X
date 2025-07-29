package dev.valhal4o1331.notenoughfeasts.world;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import dev.valhal4o1331.notenoughfeasts.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> ONION_BUSH_KEY = registerKey("onion_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, ONION_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ONION_BUSH
                                .getDefaultState().with(SweetBerryBushBlock.AGE, 3))),
                List.of(Blocks.GRASS_BLOCK)));

    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(NotEnoughFeasts.MOD_ID, name));
    };

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>> key,
                                                                                   F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
