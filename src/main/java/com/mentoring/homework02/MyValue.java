package com.mentoring.homework02;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class MyValue {

    private String value = StringUtils.EMPTY;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyValue myValue = (MyValue) o;
        return Objects.equals(value, myValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
