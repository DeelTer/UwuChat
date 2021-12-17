package ru.deelter.uwuchat.utils;

import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();

    /**
     * Get random int between '0' and 'bound'
     *
     * @param bound Max integer
     * @return Random integer
     */
    public static int getInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    /**
     * Get random boolean
     * @return true or false
     */
    public static boolean getBoolean() {
        return RANDOM.nextBoolean();
    }
}
