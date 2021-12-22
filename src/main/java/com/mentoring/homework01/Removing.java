package com.mentoring.homework01;

import java.util.List;
import java.util.Map;

public class Removing {
    public Map<Race, List<Dog>> removeMethod(Map<Race, List<Dog>> dogMap, Dog dogToRemove) {

        for (Map.Entry<Race, List<Dog>> dogMapEntry : dogMap.entrySet()) {

            dogMapEntry.getValue().remove(dogToRemove);
        }
        return dogMap;
    }
}
