package com.mentoring.homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainH03 {

    private static final String FILE_NAME = "myPropertiesH03.properties";

    public static void main(String[] args) {
        MainH03 mainH03 = new MainH03();
        mainH03.test03(FILE_NAME);
    }

    private void test01(String FILE_NAME) {
        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);
        printInputStream(inputStream);
    }

    private void test03(String FILE_NAME) {
        Properties appProps = new Properties();
        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);

        try{
            appProps.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Pole, NestedMap> map = new HashMap<>();

        for (Map.Entry<Object, Object> objectEntry : appProps.entrySet()) {

            String key1 = objectEntry.getKey().toString();
            String key2 = objectEntry.getKey().toString();
            String value = objectEntry.getValue().toString();

            Pole pole = new Pole();
            pole.setPole(key1);

            MyKey myKey = new MyKey();
            myKey.setMyKey(key2);

            MyValue myValue = new MyValue();
            myValue.setMyValue(value);

            if (map.containsKey(pole)) {
                NestedMap nestedMap = map.get(pole);
            } else {
                Map<MyKey, List<MyValue>> innerMap = new HashMap<>();
                if (innerMap.containsKey(myKey)) {
                    List<MyValue> myValues = innerMap.get(myKey);
                    myValues.add(myValue);
                } else {
                    List<MyValue> myValues = new ArrayList<>();
                    myValues.add(myValue);
                    innerMap.put(myKey, myValues);
                }
            }
        }

        for (Map.Entry<Pole, NestedMap> outerMapEntry : map.entrySet()) {
            Pole pole = outerMapEntry.getKey();
            {
                for (Map.Entry<MyKey, List<MyValue>> innerMapEntry : outerMapEntry.getValue().entrySet()) {
                    MyKey myKey = innerMapEntry.getKey();
                    List<MyValue> myValues = innerMapEntry.getValue();
                    System.out.println(String.format("key=%s; value=%s=%s", pole, myValues.toString()));
                }
            }
        }
    }


    private void printInputStream(InputStream inputStream) {
        try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InputStream getFileFromResourceAsStream(String file_name) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(FILE_NAME);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + FILE_NAME);
        } else {
            return inputStream;
        }
    }
}
