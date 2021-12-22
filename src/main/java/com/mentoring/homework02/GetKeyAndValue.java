package com.mentoring.homework02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class GetKeyAndValue {

    private static final String FILE_NAME = "myPropertiesH02.properties";

    public static void main(String[] args) {

        GetKeyAndValue getKeyAndValue = new GetKeyAndValue();
        getKeyAndValue.test02(FILE_NAME);
    }

    private void test01 (String FILE_NAME){
        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);
        printInputStream (inputStream);
    }

    private void test02 (String FILE_NAME){
        Properties appProps = new Properties();
        InputStream inputStream = getFileFromResourceAsStream(FILE_NAME);

        try {
            appProps.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<Map.Entry<Object, Object>> mapEntry =appProps.entrySet();

        Map<MyKey, List<MyValue>> myMap = new HashMap<>();
        mapEntry.forEach(e->{
                String key = e.getValue().toString();
                String value = e.getKey().toString();

                MyKey myKey = new MyKey();
                myKey.setKey(key);

                MyValue myValue = new MyValue();
                myValue.setValue(value);

                if(myMap.containsKey(myKey)){
                    List<MyValue> myValues =myMap.get(myKey);
                    myValues.add(myValue);
                }else{
                    List<MyValue> myValues = new ArrayList<>();
                    myValues.add(myValue);
                    myMap.put(myKey, myValues);
                }
            });

        Set<Map.Entry<MyKey, List<MyValue>>> anotherEntrySet = myMap.entrySet();
            anotherEntrySet.forEach(e -> {
                MyKey key = e.getKey();
                List<MyValue> values = e.getValue();
                System.out.println(String.format("key=%s; value=%s", key, values.toString()));
            });
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
