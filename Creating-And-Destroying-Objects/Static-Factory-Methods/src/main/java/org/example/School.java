package org.example;

// Advantages of static factory methods:
// 1.unlike constructors, they have names.
// 2.unlike constructors,they are not required to create a new object each time they’re invoked.
// 3.unlike constructors,they can return an object of any subtype of their return type.
// 4.the class of the returned object can vary from call to call as a function of the input
// parameters.
// 5.the returned object need not exist when the class containing the method is written.

// Limitations of static factory method
// 1.classes without public or protected constructors cannot be subclassed.
// 2.they are hard for programmers to find.

public class School {
  private String firstName;
  private String lastName;
  private String grade;
  private String address;
  private String phone;
  private String email;
  private String parentName;
  private String parentPhone;
  private String parentEmail;

  // Static factory method
  public static School createSchool(
      String firstName,
      String lastName,
      String grade,
      String address,
      String phone,
      String email,
      String parentName,
      String parentPhone,
      String parentEmail) {
    School school = new School();
    school.firstName = firstName;
    school.lastName = lastName;
    school.grade = grade;
    school.address = address;
    school.phone = phone;
    school.email = email;
    school.parentName = parentName;
    school.parentPhone = parentPhone;
    school.parentEmail = parentEmail;
    return school;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public String getParentPhone() {
    return parentPhone;
  }

  public void setParentPhone(String parentPhone) {
    this.parentPhone = parentPhone;
  }

  public String getParentEmail() {
    return parentEmail;
  }

  public void setParentEmail(String parentEmail) {
    this.parentEmail = parentEmail;
  }

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
