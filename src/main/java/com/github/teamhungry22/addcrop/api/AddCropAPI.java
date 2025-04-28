package com.github.teamhungry22.addcrop.api;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.core.objects.entity.AddCropEntity;
import com.github.teamhungry22.addcrop.core.objects.item.AddCropItem;

import java.util.Optional;

public class AddCropAPI {
    public AddCropAPI(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    /**
     * 아이템이 AddCrop 아이템인지 확인합니다.
     * @param obj 확인할 아이템
     * @return AddCrop 아이템 여부
     */
    public boolean isAddCropItem(Object obj) {
        throw new AddCropNotFoundException();
    }

    /**
     * 아이템이 AddCrop 아이템인지 확인합니다.
     * @param obj 확인할 아이템
     * @return AddCrop 아이템 여부
     */
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
