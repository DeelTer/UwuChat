package ru.deelter.uwuchat.utils;

import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();

    /**
     * Get random integer between 'min' and 'max'
     *
     * @param min Min integer
     * @param max Max integer
     * @return Random integer
     */
    public static int getInt(int min, int max) {
        return RANDOM.nextInt(1 + max-min) + min;
    }

    /**
     * Get random double between 'min' and 'max'
     *
     * @param min Min double
     * @param max Max double
     * @return Random double
     */
    public static double getDouble(double min, double max) {
        return min + (1 + max - min) * RANDOM.nextDouble();
    }

    /**
     * Get random float between 'min' and 'max'
     *
     * @param min Min float
     * @param max Max float
     * @return Random float
     */
    public static float getFloat(float min, float max) {
        return RANDOM.nextFloat() * (max - min);
    }

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
     * Get random int between '0' and '1.0'
     * @return Random double
     */
    public static double getDouble() {
        return RANDOM.nextDouble();
    }

    /**
     * Get random boolean
     * @return true or false
     */
    public static boolean getBoolean() {
        return RANDOM.nextBoolean();
    }
}
