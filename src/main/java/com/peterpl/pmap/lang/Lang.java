package com.peterpl.pmap.lang;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.peterpl.pmap.file.FileHandler;

import java.util.HashMap;
import java.util.Map;

public class Lang {
    public static final Name SET_LANGUAGE = Name.POLISH;

    public enum Name {
        ENGLISH,
        POLISH
    }

    private static HashMap<Name, HashMap<String, String>> DICTIONARIES = new HashMap<>();

    public static void init() {
        loadLanguage(Name.ENGLISH);
        loadLanguage(Name.POLISH);
    }

    public static String get(String key) {
        return DICTIONARIES.get(SET_LANGUAGE).get(key);
    }

    private static void loadLanguage(Name name) {
        HashMap<String, String> dictionary = new HashMap<>();

        JsonObject langObj = new Gson().fromJson(FileHandler.readResource("/lang/" + name.toString().toLowerCase() + ".json"), JsonObject.class);
        for(Map.Entry<String, JsonElement> entry : langObj.entrySet()) {
            parseLangFileKey(entry.getKey(), entry.getValue(), dictionary);
        }
        DICTIONARIES.put(name, dictionary);
    }

    private static void parseLangFileKey(String key, JsonElement value, HashMap<String, String> dictionary) {
        if(value.isJsonPrimitive()) {
            dictionary.put(key, value.getAsString());
            return;
        }
        for(Map.Entry<String, JsonElement> entry : value.getAsJsonObject().entrySet()) {
            String entryKey = entry.getKey();
            parseLangFileKey(entryKey.equals("$") ? key : key + "." + entryKey, entry.getValue(), dictionary);
        }
    }
}
