package org.example;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    School student1 =
        School.createSchool(
            "John",
            "Doe",
            "10",
            "123 Main St",
            "123-456-7890",
            "<EMAIL>",
            "Mary",
            "123-456-7890",
            "<EMAIL>");
    // Assessing student info using toString() method
    System.out.println(student1);
    // Assessing student info using getters
    System.out.println("Student name: " + student1.getFirstName() + " " + student1.getLastName());
    System.out.println("Student grade: " + student1.getGrade());
    System.out.println("Student address: " + student1.getAddress());
    System.out.println("Student phone: " + student1.getPhone());
    System.out.println("Student email: " + student1.getEmail());
    System.out.println("Parent name: " + student1.getParentName());
    System.out.println("Parent phone: " + student1.getParentPhone());
    System.out.println("Parent email: " + student1.getParentEmail());

    // Modify student name using setters
    student1.setFirstName("Jane");
    student1.setLastName("Whitney");
    student1.setGrade("11");
    student1.setAddress("456 Sesame Street");
    student1.setPhone("987-654-3210");
    student1.setEmail("<EMAIL>");
    student1.setParentName("John");
    student1.setParentPhone("123-456-7890");
    student1.setParentEmail("<EMAIL>");
    System.out.println(student1);
  }
}
