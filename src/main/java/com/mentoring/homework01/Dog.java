package com.mentoring.homework01;

import java.util.Objects;

public class Dog {

        private Race race;
        private String name;

    public Dog(Race race, String name) {
        this.race = race;
        this.name = name;
    }

        public Race getRace() {
        return race;
    }

        public void setRace(Race race) {
        this.race = race;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        @Override
        public String toString() {
        return "com.mentoring.homework01.Dog{" +
                "race=" + race +
                ", name='" + name + '\'' +
                '}';
    }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(race, dog.race) && Objects.equals(name, dog.name);
    }

        @Override
        public int hashCode() {
        return Objects.hash(race, name);
    }

}
