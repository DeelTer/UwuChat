package ru.deelter.uwuchat;

import org.bukkit.configuration.file.FileConfiguration;
import ru.deelter.uwuchat.utils.ListUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UwuConfig {

    public static Map<String, String> SOFT_WORDS, SOFT_SYMBOLS;
    public static List<String> START_WORDS, END_WORDS, EMOJIES;

    private static final UwuChat INSTANCE = UwuChat.getInstance();

    public static void setup() {
        FileConfiguration config = INSTANCE.getConfig();
        SOFT_WORDS = formMap(config.getStringList("soft"));
        SOFT_SYMBOLS = formMap(config.getStringList("soft-symbols"));
        END_WORDS = config.getStringList("ends");
        START_WORDS = config.getStringList("start");
        EMOJIES = config.getStringList("emojies");
    }

    public static String getRandomEnd() {
        return ListUtils.getRandom(END_WORDS);
    }

    public static String getRandomStart() {
        return ListUtils.getRandom(START_WORDS);
    }

    public static String getRandomEmoji() {
        return ListUtils.getRandom(EMOJIES);
    }

    private static Map<String, String> formMap(List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String s : list) {
            String[] keyAndValue = s.split("->");
            map.put(keyAndValue[0], keyAndValue[1]);
        }
        return map;
    }
}
