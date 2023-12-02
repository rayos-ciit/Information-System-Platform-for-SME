/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pt4rayosg12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pt4rayosg12 {

    private static userInfo userManager = new userInfo();
    private static admin adminUser = new admin(userManager);
    private static manager managerUser = new manager(userManager);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Added dummy accounts for testing
        addDummyAccounts(userManager);

        // Verify if dummy accounts are being read
        userManager.printUserList();

        mainMenu();
        login();
    }

    static void print(String message) {
        System.out.println(message);
    }

    static void mainMenu() {
        while (true) {
            print("Greetings, welcome to the Management System");
            print("1. Login");
            print("2. Exit");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        login();
                        break;
                    case 2:
                        print("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        print("Invalid choice. Please try again.");
                        break;
                }

            } catch (InputMismatchException e) {
                print("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // this is to prevent looping
            }
        }
    }

    private static void login() {
        print("Enter username: ");
        String username = scanner.next();
        print("Enter password: ");
        String password = scanner.next();

        // Authenticate the user using userManager
        user authenticatedUser = userManager.authenticateUser(username, password);

        if (authenticatedUser != null) {
            String role = authenticatedUser.getRole();
            if ("admin".equals(role)) {
                adminUser.adminDashboard(authenticatedUser); // Redirect to admin dashboard
            } else if ("manager".equals(role)) {
                managerUser.managerDashboard(authenticatedUser); //Redirect to manager dashboard
            } else if ("supervisor".equals(role)) {
                // Redirect to supervisor dashboard
            } else if ("operations".equals(role)) {
                // Redirect to operations staff dashboard
            } else {
                print("Unknown role. Please contact your administrator.");
            }
        } else {
            print("Authentication failed. Please try again.");
        }
    }

    public static void addDummyAccounts(userInfo userManager) {
        // Create dummy user accounts

        user user1 = new user("John", "Doe", "Litao", "Male", "1990-01-15", "EMP001", "johnlitao", "password", "Administrator", "admin");
        user user2 = new user("Alice", "Smith", "Johnson", "Female", "1985-03-22", "EMP002", "alicejohnson", "password123", "Supervisor", "supervisor");
        user user3 = new user("Andrew", "Ahmesberger", "Reinhardt", "Male", "1995-06-10", "EMP003", "andrewahmesberger", "pass123", "Operations", "operations");
        user user4 = new user("Kristina", "Valerie", "Houston", "Male", "2001-06-07", "EMP004", "kristinavalerie", "123pass", "Manager", "manager");

        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(user3);
        userManager.addUser(user4);
    }
}
