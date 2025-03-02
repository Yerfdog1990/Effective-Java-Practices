package org.example;

/*
JavaBeans are classes that encapsulate many objects into a single object (the bean).
It is a Java class that should follow the following conventions:
    1.Must implement Serializable.
    2.It should have a public no-arg constructor.
    A3.ll properties in java bean must be private with public getters and setter methods.

Properties for setter methods:
    1.It should be public in nature.
    2.The return type a should be void.
    3.The setter method should be prefixed with the set.
    4.It should take some argument i.e. it should not be a no-arg method.

Properties for getter methods:
    1.It should be public in nature.
    2.The return type should not be void i.e. according to our requirement, return type we have to give the return type.
    3.The getter method should be prefixed with get.
    4.It should not take any argument.
For Boolean properties getter method name can be prefixed with either “get” or “is”. But recommended to use “is”.
 */
import java.io.Serial;
import java.io.Serializable;

public class School implements Serializable {
  @Serial private static final long serialVersionUID = 1L;
  private String firstName;
  private String lastName;
  private String grade;
  private String address;
  private String phone;
  private String email;
  private String parentName;
  private String parentPhone;
  private String parentEmail;

  // Setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public void setParentPhone(String parentPhone) {
    this.parentPhone = parentPhone;
  }

  public void setParentEmail(String parentEmail) {
    this.parentEmail = parentEmail;
  }

  // Getters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getGrade() {
    return grade;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getParentName() {
    return parentName;
  }

  public String getParentPhone() {
    return parentPhone;
  }

  public String getParentEmail() {
    return parentEmail;
  }

  // toString() method

  @Override
  public String toString() {
    return "School{"
        + "firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", grade='"
        + grade
        + '\''
        + ", address='"
        + address
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", email='"
        + email
        + '\''
        + ", parentName='"
        + parentName
        + '\''
        + ", parentPhone='"
        + parentPhone
        + '\''
        + ", parentEmail='"
        + parentEmail
        + '\''
        + '}';
  }
}
