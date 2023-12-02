/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt4rayosg12;

import java.util.LinkedList;

/**
 *
 * @author Student
 */
public class userInfo { //LinkedList of users//

    public userInfo() {
        userList = new LinkedList<user>(); //declaration of userList Linked
    }

    LinkedList<user> userList; //list of all users//

    public LinkedList<user> getUserList() { //getter of all users//
        return userList;
    }

    public void addUser(user u) {// add user function//

        userList.add(u);
    }

    public void removeUser(user u) { //delete user function//

        userList.remove(u);
    }

    public user authenticateUser(String username, String password) {
        for (user user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Match found, return the authenticated user
            }
        }
        return null; // No match found, authentication failed
    }

    public void printUserList() {
        for (user user : userList) {
            System.out.println("Username: " + user.getUsername() + " | Password: " + user.getPassword());
            // Add more fields if needed to print other user details
        }
    }

}
