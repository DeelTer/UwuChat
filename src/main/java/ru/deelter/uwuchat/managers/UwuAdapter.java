package ru.deelter.uwuchat.managers;

import org.jetbrains.annotations.NotNull;
import ru.deelter.uwuchat.UwuConfig;
import ru.deelter.uwuchat.utils.RandomUtils;

import java.util.Map;

public class UwuAdapter {

    public static String adapt(@NotNull String text) {
        String adapt = makeSoft(text.trim());
        adapt = makeSoftSymbols(adapt);

        char[] chars = adapt.toCharArray();
        if (adapt.length() > 6 && RandomUtils.getBoolean()) {
            final String firstChar = String.valueOf(chars[0]);
            String prefix = RandomUtils.getBoolean() ? (firstChar +  "-") : (firstChar +  ".. ");
            adapt = prefix + adapt;
        } else adapt = UwuConfig.getRandomStart() + adapt;


        if (RandomUtils.getBoolean()) adapt = adapt + UwuConfig.getRandomEnd();
        if (RandomUtils.getBoolean()) adapt = adapt + " " + UwuConfig.getRandomEmoji();

        return adapt;
    }

    private static String makeSoftSymbols(String text) {
        String lowerCase = text.toLowerCase();
        for (Map.Entry<String, String> entry : UwuConfig.SOFT_SYMBOLS.entrySet()) {
            String symbol = entry.getKey();
            if (!lowerCase.contains(symbol)) continue;
            if (RandomUtils.getBoolean()) lowerCase = lowerCase.replace(symbol, entry.getValue());
        }
        return lowerCase;
    }

    public static String makeSoft(@NotNull String text) {
        String lowerCase = text.toLowerCase();
        String[] words = lowerCase.split(" ");
        for (String word : words) {
            if (UwuConfig.SOFT_WORDS.containsKey(word)) {
                String value = UwuConfig.SOFT_WORDS.get(word);
                lowerCase = lowerCase.replace(word, value);
            }
        }
        return lowerCase;
    }
}
