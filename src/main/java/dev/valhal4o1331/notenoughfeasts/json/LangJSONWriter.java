package dev.valhal4o1331.notenoughfeasts.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class LangJSONWriter {

    private final ObjectMapper mapper;
    private final String langFilePath;
    private Map<String, String> translations;

    public LangJSONWriter(String langFileName) {
        this.mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        this.langFilePath = "src/main/resources/assets/notenoughfeasts/lang/" + langFileName + ".json";

        File file = new File(langFilePath);
        try {
            if (!file.exists()) {
                System.out.println("[LangJSONWriter] File does not exist, creating: " + langFilePath);
                if (file.getParentFile() != null) {
                    boolean dirsCreated = file.getParentFile().mkdirs();
                    if (dirsCreated) {
                        System.out.println("[LangJSONWriter] Created directories for path.");
                    }
                }
                boolean fileCreated = file.createNewFile();
                System.out.println("[LangJSONWriter] File created: " + fileCreated);
                this.translations = new HashMap<>();
                save();  // Записваме празен JSON, за да има валиден файл
            } else if (file.length() == 0) {
                System.out.println("[LangJSONWriter] File is empty, initializing empty translations map.");
                this.translations = new HashMap<>();
            } else {
                System.out.println("[LangJSONWriter] Loading existing translations from file.");
                this.translations = mapper.readValue(file, Map.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
            this.translations = new HashMap<>();
        }
    }

    public void translate(String id, String value) {
        translations.put(id, value);
        save();
    }

    public void translateItem(String id, String value) {
        translate("item.notenoughfeasts." + id, value);
    }

    public void translateBlock(String id, String value) {
        translate("block.notenoughfeasts." + id, value);
    }

    public void translateItemGroup(String id, String value) {
        translate("itemgroup.notenoughfeasts." + id, value);
    }

    private void save() {
        try {
            mapper.writeValue(Paths.get(langFilePath).toFile(), translations);
            System.out.println("[LangJSONWriter] Saved translations to " + langFilePath);
        } catch (IOException e) {
            System.err.println("Failed to save lang JSON:");
            e.printStackTrace();
        }
    }
}
