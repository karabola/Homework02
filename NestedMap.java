package com.mentoring.homework03;

import java.util.*;

public class NestedMap {

    private Map<MyKey, List<MyValue>> innerMap = new HashMap<>();

    public void put(MyKey myKey, MyValue myValue) {
        if (innerMap.get(myKey) == null) {
            List<MyValue> myValues = new ArrayList<>();
            myValues.add(myValue);
            innerMap.put(myKey, myValues);
        }
    }

    public Map<MyKey, List<MyValue>> get(MyKey myKey, MyValue myValue) {
        innerMap.get(myKey);
        return innerMap;
    }

    public void setInnerMap(Map<MyKey, List<MyValue>> innerMap) {
        this.innerMap = innerMap;
    }
}