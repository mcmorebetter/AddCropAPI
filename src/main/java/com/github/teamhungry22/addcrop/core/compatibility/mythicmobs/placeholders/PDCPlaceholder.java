package com.github.teamhungry22.addcrop.core.compatibility.mythicmobs.placeholders;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import io.lumine.mythic.core.skills.placeholders.PlaceholderExecutor;

public class PDCPlaceholder implements AddCropPlaceholder {
    @Override
    public void register(PlaceholderExecutor placeholderManager) {
        throw new AddCropNotFoundException();
    }
}
