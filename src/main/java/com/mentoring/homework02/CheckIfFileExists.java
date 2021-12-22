package com.mentoring.homework02;

import java.io.File;

public class CheckIfFileExists {
    public void confirmationThatFileExists(File file1, File file2) {

        if (file1.exists() && file2.exists()) {
            System.out.println("File1 exists " + file1.getAbsolutePath() + " and File2 exists as well " + file2.getAbsolutePath());
        } else if (file1.exists()) {
            System.out.println("File1 exists " + file1.getAbsolutePath());
        } else if (file2.exists()) {
            System.out.println("File2 exists " + file2.getAbsolutePath());
        } else {
            System.out.println("Non of files exists");
        }
    }
}
