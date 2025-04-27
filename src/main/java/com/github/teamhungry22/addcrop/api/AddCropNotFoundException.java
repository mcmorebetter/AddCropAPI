package com.github.teamhungry22.addcrop.api;

import java.io.Serial;

public class AddCropNotFoundException extends UnsupportedOperationException {
    @Serial
    private static final long serialVersionUID = 1L;

    public AddCropNotFoundException() {
        super("Error: AddCrop not found!");
    }
}