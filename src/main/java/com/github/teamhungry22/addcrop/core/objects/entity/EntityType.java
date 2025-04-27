package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum EntityType {
    CROP,
    MOLE,
    ANGEL;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static EntityType get(String value) {
        throw new AddCropNotFoundException();
    }
}
