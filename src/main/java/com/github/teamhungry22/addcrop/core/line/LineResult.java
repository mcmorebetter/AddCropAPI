package com.github.teamhungry22.addcrop.core.line;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum LineResult {
    SUCCESS,
    FAIL;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static LineResult get(String value) {
        throw new AddCropNotFoundException();
    }
}
