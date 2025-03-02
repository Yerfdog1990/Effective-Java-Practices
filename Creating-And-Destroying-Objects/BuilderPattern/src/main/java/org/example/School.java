package org.example;

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

  private School(SchoolBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.grade = builder.grade;
    this.address = builder.address;
    this.phone = builder.phone;
    this.email = builder.email;
    this.parentName = builder.parentName;
    this.parentPhone = builder.parentPhone;
    this.parentEmail = builder.parentEmail;
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

  static class SchoolBuilder {
    private String firstName;
    private String lastName;
    private String grade;
    private String address;
    private String phone;
    private String email;
    private String parentName;
    private String parentPhone;
    private String parentEmail;

    // Getters
    public SchoolBuilder getFirstName() {
      this.firstName = firstName;
      return this;
    }

    public SchoolBuilder getLastName() {
      this.lastName = lastName;
      return this;
    }

    public SchoolBuilder getGrade() {
      this.grade = grade;
      return this;
    }

    public SchoolBuilder getAddress() {
      this.address = address;
      return this;
    }

    public SchoolBuilder getPhone() {
      this.phone = phone;
      return this;
    }

    public SchoolBuilder getEmail() {
      this.email = email;
      return this;
    }

    public SchoolBuilder getParentName() {
      this.parentName = parentName;
      return this;
    }

    public SchoolBuilder getParentPhone() {
      this.parentPhone = parentPhone;
      return this;
    }

    public SchoolBuilder getParentEmail() {
      this.parentEmail = parentEmail;
      return this;
    }

    // Setters
    public SchoolBuilder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public SchoolBuilder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public SchoolBuilder setGrade(String grade) {
      this.grade = grade;
      return this;
    }

    public SchoolBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public SchoolBuilder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public SchoolBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public SchoolBuilder setParentName(String parentName) {
      this.parentName = parentName;
      return this;
    }

    public SchoolBuilder setParentPhone(String parentPhone) {
      this.parentPhone = parentPhone;
      return this;
    }

    public SchoolBuilder setParentEmail(String parentEmail) {
      this.parentEmail = parentEmail;
      return this;
    }

    //
    public School build() {
      return new School(this);
    }
  }
}
