package com.github.teamhungry22.addcrop.core.line;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public enum LineType {
    LIST,
    EXP,
    DROP,
    SOUND,
    COMMAND,
    MESSAGE,
    BROADCAST,
    SKILL,
    SUMMON,
    PARTICLE;

    public static boolean has(String value) {
        throw new AddCropNotFoundException();
    }

    public static LineType get(String value) {
        throw new AddCropNotFoundException();
    }
}