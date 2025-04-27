package com.github.teamhungry22.addcrop.core.util;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MathUtils {
    public static Double parsedDouble(String value, Double def) {
        throw new AddCropNotFoundException();
    }

    public static Integer getRangeToInt(String range, String splitKey, Integer def) {
        throw new AddCropNotFoundException();
    }

    public static Double getRangeToDouble(String range, String splitKey, Double def) {
        throw new AddCropNotFoundException();
    }

    public static Float getRangeToFloat(String range, String splitKey, Float def) {
        throw new AddCropNotFoundException();
    }

    public static Integer getRandomInt(Integer min, Integer max) {
        throw new AddCropNotFoundException();
    }

    public static Integer getRandomInt(Integer integer) {
        throw new AddCropNotFoundException();
    }

    public static Double getRandomDouble(Double min, Double max) {
        throw new AddCropNotFoundException();
    }

    public static Float getRandomFloat(Float min, Float max) {
        throw new AddCropNotFoundException();
    }

    public static boolean getChance(double chance) {
        throw new AddCropNotFoundException();
    }

    public static Integer getIndexWeight(List<Double> weights) {
        throw new AddCropNotFoundException();
    }

    private static <T extends Number> T parseRange(String range, String splitKey, Function<String, T> parser, BiFunction<T, T, T> randomizer, T def) {
        throw new AddCropNotFoundException();
    }
}
