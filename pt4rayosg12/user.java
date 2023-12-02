/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt4rayosg12;

/**
 *
 * @author Student
 */
public class user {

    //declaration//
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String gender;
    private String birthDate;
    private String employeeID;
    private String username;
    private String password;
    private String jobTitle;
    private String role;

    //constructor//
    public user(String FirstName, String MiddleName, String LastName, String gender, String birthDate, String employeeID, String username, String password, String jobTitle, String role) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.jobTitle = jobTitle;
        this.role = role;
    }

    public user() {
        this.FirstName = "FirstName";
        this.MiddleName = "MiddleName";
        this.LastName = "LastName";
        this.gender = "gender";
        this.birthDate = "birthDate";
        this.employeeID = "employeeID";
        this.username = "username";
        this.password = "password";
        this.jobTitle = "jobTitle";
        this.role = "role";

    }

    //getter
    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getRole() {
        return role;
    }

    //setter
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
