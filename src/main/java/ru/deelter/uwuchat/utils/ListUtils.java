package ru.deelter.uwuchat.utils;

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

}
