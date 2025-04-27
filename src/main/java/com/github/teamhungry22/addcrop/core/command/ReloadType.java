package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum ReloadType {
    FIRST,
    NORMAL,
    AUTO;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static ReloadType get(String value) {
        throw new AddCropNotFoundException();
    }
}
