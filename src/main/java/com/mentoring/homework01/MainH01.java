package com.mentoring.homework01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainH01 {

    /*
    utwórz mapę gdzie:
- kluczem jest rasa
- wartością lista psów
-zainicjalizuj tą mapę kluczami i listami psów
-z mapy usuń jakiegoś psa pod jakimiś kluczem
    */

    public static void main(String[] args) {

        Race race1 = new Race("boxer");
        Race race2 = new Race("terrier");
        Race race3 = new Race("fox terrier");
        Race race4 = new Race("labrador");

        List<Dog> boxerList = new ArrayList<>();
        boxerList.add(new Dog(race1, "Riki"));
        boxerList.add(new Dog(race1, "Diki"));
        boxerList.add(new Dog(race1, "Miki"));

        List<Dog> terrierList = new ArrayList<>();
        terrierList.add(new Dog(race2, "Afi"));
        terrierList.add(new Dog(race3, "Ami"));
        terrierList.add(new Dog(race3, "Aki"));

        List<Dog> labrador = new ArrayList<>();
        labrador.add(new Dog(race4, "Dafi"));
        labrador.add(new Dog(race4, "Adi"));
        labrador.add(new Dog(race4, "Radi"));

        HashMap<Race, List<Dog>> dogMap = new HashMap<>();
        dogMap.put(race1, boxerList);
        dogMap.put(race4, labrador);
        dogMap.put(race2, terrierList);

        System.out.println(dogMap);

        Removing removing = new Removing();
        Map<Race, List<Dog>> result = removing.removeMethod(dogMap, new Dog(race4, "Dafi"));

        System.out.println("Result: " + result);

    }
}
