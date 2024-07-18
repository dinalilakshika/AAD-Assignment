package com.example.aad_assignment;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationClass {

    public static void main(String[] args) {
        Student student = new Student();
        try (FileInputStream fileInputStream = new FileInputStream("Student.ser")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            System.out.println("Object deserialized successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
