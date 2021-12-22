package com.mentoring.homework03;

import java.util.Objects;

public class MyKey {

    private String myKey;

    public String getMyKey() {
        return myKey;
    }

    public void setMyKey(String myKey) {
        this.myKey = myKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey1 = (MyKey) o;
        return Objects.equals(myKey, myKey1.myKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myKey);
    }

    @Override
    public String toString() {
        return myKey;
    }
}
