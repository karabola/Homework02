package com.mentoring.homework03;

import java.util.Objects;

public class MyValue {


    private String myValue;

    public String getMyValue() {
        return myValue;
    }

    public void setMyValue(String myValue) {
        this.myValue = myValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyValue myValue1 = (MyValue) o;
        return Objects.equals(myValue, myValue1.myValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myValue);
    }

    @Override
    public String toString() {
        return myValue;
    }
}
