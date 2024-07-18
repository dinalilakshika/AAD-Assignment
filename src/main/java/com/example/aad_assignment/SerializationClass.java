package com.example.aad_assignment;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {
        Student student = new Student("S001", "Dinali", "Agalawatta");

        try (FileOutputStream fileOutputStream = new FileOutputStream("student.ser")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Object serialized successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
