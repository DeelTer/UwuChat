package ru.deelter.uwuchat.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    /**
     * Return one random element
     * from collection
     *
     * @param list Collection
     * @param <T> any
     * @return Random element
     */
    public static <T> T getRandom(List<T> list) {
        return list.get(RandomUtils.getInt(list.size()));
    }

    /**
     * Return one random element
     * from collection (with default value)
     *
     * @param list Collection
     * @param defaultValue Default value
     * @param <T> any
     * @return Random element
     */
    public static <T> T getRandom(List<T> list, T defaultValue) {
        return (list == null || list.isEmpty()) ? defaultValue : getRandom(list);
    }

    /**
     * Return N('count') random elements
     * from collection
     *
     * @param list Collection
     * @param count Elements count
     * @param <T> any
     * @return List with elements
     */
    public static <T> List<T> getRandom(List<T> list, int count) {
        List<T> finalList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            T randomValue = getRandom(list);
            finalList.add(randomValue);
        }
        return finalList;
    }
}
