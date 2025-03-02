package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    School school = new School();
    school.setFirstName("John");
    school.setLastName("Doe");
    school.setGrade("10");
    school.setAddress("123 Main Street");
    school.setPhone("123-456-7890");
    school.setEmail("<EMAIL>");
    school.setParentName("Mary");
    school.setParentPhone("987-654-3210");
    school.setParentEmail("<EMAIL>");

    // Access class properties using toString() method
    System.out.println(school);

    // Access class properties using getter() methods
    System.out.println("Student name: " + school.getFirstName() + " " + school.getLastName());
    System.out.println("Student grade: " + school.getGrade());
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("school.ser"))) {
      out.writeObject(school);
      System.out.println("Serialized data is saved in school.ser");
      out.flush();
    } catch (Exception e) {
      System.out.println("Object not serialized");
    }
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("school.ser"))) {
      school = (School) ois.readObject();
      System.out.println("Deserialized School object: " + school);
    } catch (Exception e) {
      System.out.println("Object not deserialized");
    }
  }
}
