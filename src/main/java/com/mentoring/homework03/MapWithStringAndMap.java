//package com.mentoring.homework03;
//
//import com.mentoring.homework02.MyKey;
//import com.mentoring.homework02.MyValue;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.util.*;
//
//public class MapWithStringAndMap {
//
//    private static final String FILE_NAME = "myPropertiesH03.properties";
//
//    public static void main(String[] args) {
//        MapWithStringAndMap mapStringMap = new MapWithStringAndMap();
//        mapStringMap.test05(FILE_NAME);
//    }
//
//    private void test01(String FILE_NAME) {
//        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);
//        printInputStream(inputStream);
//    }
//
//    private void test05(String FILE_NAME) {
//        Properties appProps1 = new Properties();
//        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);
//
//        try {
//            appProps1.load(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Set<Map.Entry<Object, Object>> mapEntry = appProps1.entrySet();
//
//        Map<Pole, Map<MyKey, List<MyValue>>> map = new HashMap<>();
//        mapEntry.forEach(e -> {
//            String key = e.getKey().toString();
//            String value = e.getValue().toString();
//
//            Pole pole = new Pole();
//            pole.setPole(key);
//
//
//            if (map.containsKey(pole)) {
//
//                Properties appProps2 = new Properties();
//                Set<Map.Entry<Object, Object>> intenalMapEntry = appProps2.entrySet();
//                Map<MyKey, List<MyValue>> internalMap = new HashMap<>();
//
//                intenalMapEntry.forEach(n -> {
//                    String key1 = n.getKey().toString();
//
//                    MyKey myKey = new MyKey();
//                    myKey.setKey(key1);
//                    com.mentoring.homework02.MyValue myValue = new com.mentoring.homework02.MyValue();
//                    myValue.setValue(value);
//
//                    if (internalMap.containsKey(myKey)) {
//                        List<com.mentoring.homework02.MyValue> myValues = internalMap.get(myKey);
//                        myValues.add(myValue);
//
//                    } else {
//                        List<com.mentoring.homework02.MyValue> myValues = new ArrayList<>();
//                        myValues.add(myValue);
//                        internalMap.put(myKey, myValues);
//                    }
//                });
//            }
//        });
//
//        Set<Map.Entry<Pole, Map<com.mentoring.homework02.MyKey, List<com.mentoring.homework02.MyValue>>>> anotherEntrySet = map.entrySet();
//        anotherEntrySet.forEach(e -> {
//            Pole pole = e.getKey();
//            Map<MyKey, List<MyValue>> internalMap = e.getValue();
////            System.out.println(String.format("key=%s; value=%s", pole, internalMap.toString()));
//            System.out.println("key= " + pole + " value " + internalMap);
//        });
//
//    }
//        private void printInputStream (InputStream inputStream){
//            try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//                 BufferedReader reader = new BufferedReader(streamReader)) {
//
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    System.out.println(line);
//                }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        private InputStream getFileFromResourceAsStream (String FILE_NAME){
//
//            // The class loader that loaded the class
//            ClassLoader classLoader = getClass().getClassLoader();
//            InputStream inputStream = classLoader.getResourceAsStream(FILE_NAME);
//
//            // the stream holding the file content
//            if (inputStream == null) {
//                throw new IllegalArgumentException("file not found! " + FILE_NAME);
//            } else {
//                return inputStream;
//            }
//        }
//    }


