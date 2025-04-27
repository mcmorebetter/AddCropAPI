package com.github.teamhungry22.addcrop.core.line;


import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

// 사실상 line이 발동될 때마다 새로 생성되기에
// configManager에서 생성하는 방식으로 최적화 작업 필요
public class LineManager {
    public LineManager(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public List<Line> line(String result) {
        throw new AddCropNotFoundException();
    }

    public List<Line> line(List<String> resultList) {
        throw new AddCropNotFoundException();
    }

    public Line getLine(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    public Optional<Line> buildLine(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }
}