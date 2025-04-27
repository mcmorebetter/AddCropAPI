package com.github.teamhungry22.addcrop.core.config.data;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;

public class MoleData extends EntityData {
    public MoleData(String id, String amount, double health, double damage, double time, int stack, List<String> resultList) {
        super(id, "mole", amount, health, damage, time, resultList);
        throw new AddCropNotFoundException();
    }

    public int getStack() {
        throw new AddCropNotFoundException();
    }
}
