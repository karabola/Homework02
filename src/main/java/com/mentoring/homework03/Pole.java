package com.mentoring.homework03;

import java.util.Objects;

public class Pole {
    private String pole;

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pole pole = (Pole) o;
        return Objects.equals(this.pole, pole.pole) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pole);
    }

    @Override
    public String toString() {
        return pole;
    }
}
