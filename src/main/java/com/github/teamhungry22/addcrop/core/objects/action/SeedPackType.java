package com.github.teamhungry22.addcrop.core.objects.action;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum SeedPackType {
    CUSTOM,
    VANILLA;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static SeedPackType get(String value) {
        throw new AddCropNotFoundException();
    }
}
