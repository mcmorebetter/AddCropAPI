package com.github.teamhungry22.addcrop.api;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.core.objects.entity.AddCropEntity;
import com.github.teamhungry22.addcrop.core.objects.item.AddCropItem;

import java.util.Optional;

public class AddCropAPI {
    public AddCropAPI(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public boolean isAddCropItem(Object obj) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropItem> getAddCropItem(Object obj) {
        throw new AddCropNotFoundException();
    }

    public boolean isAddCropEntity(Object obj) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropEntity> getAddCropEntity(Object obj) {
        throw new AddCropNotFoundException();
    }
}
