package com.github.teamhungry22.addcrop.core.line;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LineUtils {
    public static int getInt(Map<String, String> stringMap, String[] aliases, int def) {
        throw new AddCropNotFoundException();
    }

    public static double getDouble(Map<String, String> stringMap, String[] aliases, double def) {
        throw new AddCropNotFoundException();
    }

    public static String getString(Map<String, String> stringMap, String[] aliases, String def) {
        throw new AddCropNotFoundException();
    }

    public static boolean getBoolean(Map<String, String> stringMap, String[] aliases, boolean def) {
        throw new AddCropNotFoundException();
    }

    public static List<String> getStringList(Map<String, String> stringMap, String[] aliases, String type) {
        throw new AddCropNotFoundException();
    }

    public static Map<String, String> parseStringToMap(String input, boolean autoPrefix) {
        throw new AddCropNotFoundException();
    }

    private static <T extends Number> T parseNumber(Map<String, String> stringMap, String[] aliases, Function<String, T> parser, T def) {
        throw new AddCropNotFoundException();
    }
}
