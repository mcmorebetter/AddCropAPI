package com.github.teamhungry22.addcrop.core.config.data;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum CropType {
    SMALL,
    BIG;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static CropType get(String value) {
        throw new AddCropNotFoundException();
    }
}
