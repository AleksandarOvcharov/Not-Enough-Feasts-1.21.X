package dev.valhal4o1331.notenoughfeasts.util;

import dev.valhal4o1331.notenoughfeasts.NotEnoughFeasts;
import dev.valhal4o1331.notenoughfeasts.json.LangJSONWriter;

public class LangWriter {

    private static final String APPLE_PIE = "apple_pie";
    private static final String ONION = "onion";
    private static final String ONION_SEEDS = "onion_seeds";
    private static final String ONION_ROOT = "onion_root";
    private static final String ONION_CROP = "onion_crop";
    private static final String ONION_BUSH = "onion_bush";
    private static final String NOT_ENOUGH_FEASTS_ITEMS = "not_enough_feasts_items";

    public static final String LANG_EN = "en_us";
    public static final String LANG_BG = "bg_bg";

    public static void main(String[] args) {

        LangJSONWriter writerEN = new LangJSONWriter(LANG_EN);
        LangJSONWriter writerBG = new LangJSONWriter(LANG_BG);

        writerEN.translateItem(APPLE_PIE, "Apple Pie");
        writerEN.translateItem(ONION, "Onion");
        writerEN.translateItem(ONION_SEEDS, "Onion Seeds");
        writerEN.translateItem(ONION_ROOT, "Onion Root");
        writerEN.translateBlock(ONION_CROP, "Onion Crop");
        writerEN.translateBlock(ONION_BUSH, "Onion Bush");
        writerEN.translateItemGroup(NOT_ENOUGH_FEASTS_ITEMS, "Not Enough Feasts Items");

        writerBG.translateItem(APPLE_PIE, "Ябълков пай");
        writerBG.translateItem(ONION, "Лук");
        writerBG.translateItem(ONION_SEEDS, "Лукови семена");
        writerBG.translateItem(ONION_ROOT, "Луков корен");
        writerBG.translateBlock(ONION_CROP, "Луково растение");
        writerBG.translateBlock(ONION_BUSH, "Луков храст");
        writerBG.translateItemGroup(NOT_ENOUGH_FEASTS_ITEMS, "Not Enough Feasts Предмети");

    }

    public static void registerLangJSONKeys() {
        NotEnoughFeasts.LOGGER.info("[NotEnoughFeasts] Registered LANG files");
    }
}
