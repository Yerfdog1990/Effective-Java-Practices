package org.example;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    SchoolRegister schoolRegister = new SchoolRegister();
    School student1 = schoolRegister.registerStudent1();

    // Access student detail using toString() method
    System.out.println(student1);
  }
}
