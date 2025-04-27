package com.github.teamhungry22.addcrop.core.config.data;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

public class MessageData {
    public String getMessage() {
        throw new AddCropNotFoundException();
    }

    public void setMessage(String text) {
        throw new AddCropNotFoundException();
    }

    public String getSound() {
        throw new AddCropNotFoundException();
    }

    public void setSound(String sound) {
        throw new AddCropNotFoundException();
    }
}
