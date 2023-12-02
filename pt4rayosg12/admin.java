/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt4rayosg12;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.mycompany.pt4rayosg12.Pt4rayosg12.print;

/**
 *
 * @author Student
 */
public class admin extends user {


    private userInfo userManager;

    public admin(userInfo userManager) {
        this.userManager = userManager;
    }

    public void adminDashboard(user authenticatedUser) {
        if (!"admin".equals(authenticatedUser.getRole())) {
            print("You don't have permission to access the Admin Dashboard.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            print("Admin Dashboard");
            print("1. View User");
            print("2. Add User");
            print("3. Edit User");
            print("4. Delete User");
            print("5. Modify User Access");
            print("6. Logout");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        viewAccount();
                        break;
                    case 2:
                        addAccount();
                        break;
                    case 3:
                        editAccount();
                        break;
                    case 4:
                        deleteAccount();
                        break;
                    case 5:
                        modifyUserAccess();
                        break;
                    case 6:
                        print("Logged out.");
                        return;
                    default:
                        print("Invalid choice. Please try again.");
                        break;
                }

            } catch (InputMismatchException e) {
                print("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // This is to prevent looping
            }
        }
    }

    public void viewAccount() {
        Scanner scanner = new Scanner(System.in);
        print("Enter the employeeID to view the account: ");
        String employeeIDToSearch = scanner.nextLine();

        // Search for the user by employeeID in the user list
        for (user u : userManager.getUserList()) {
            if (u.getEmployeeID().equals(employeeIDToSearch)) {
                // Display user details
                print("Employee ID: " + u.getEmployeeID());
                print("First Name: " + u.getFirstName());
                print("Last Name: " + u.getLastName());
                print("Gender: " + u.getGender());
                print("Birth Date: " + u.getBirthDate());
                print("Job Title: " + u.getJobTitle());
                print("Role: " + u.getRole());
                return;
            }
        }

        // If the user with the specified employeeID is not found
        print("User with employeeID " + employeeIDToSearch + " not found.");
        exit();
    }

    public void addAccount() {
        Scanner scanner = new Scanner(System.in);
        // Prompt the admin to enter user details
        print("Enter First Name: ");
        String firstName = scanner.next();
        print("Enter Middle Name: ");
        String middleName = scanner.next();
        print("Enter Last Name: ");
        String lastName = scanner.next();
        print("Enter Gender: ");
        String gender = scanner.next();
        print("Enter Birth Date: ");
        String birthDate = scanner.next();
        print("Enter Employee ID: ");
        String employeeID = scanner.next();
        print("Enter Username: ");
        String username = scanner.next();
        print("Enter Password: ");
        String password = scanner.next();
        print("Enter Job Title: ");
        String jobTitle = scanner.next();
        print("Enter Role (admin/manager/supervisor/operations): ");
        String role = scanner.next();

        // Create a new user object
        user newUser = new user(firstName, middleName, lastName, gender, birthDate, employeeID, username, password, jobTitle, role);

        // Add the new user to the user list
        userManager.addUser(newUser);

        // Inform the admin that the user has been added
        print("User added successfully.");
    }

    public void editAccount() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print("Enter the employeeID to edit the account (or 'exit' to return to the Admin Dashboard): ");
            String employeeIDToEdit = scanner.nextLine();

            if (employeeIDToEdit.equalsIgnoreCase("exit")) {
                exit();
                return; // Return to the Admin Dashboard
            }

            // Search for the user by employeeID in the user list
            user userToEdit = null;
            for (user u : userManager.getUserList()) {
                if (u.getEmployeeID().equals(employeeIDToEdit)) {
                    userToEdit = u;
                    break;
                }
            }

            if (userToEdit == null) {
                // If the user with the specified employeeID is not found
                print("User with employeeID " + employeeIDToEdit + " not found.");
            } else {
                print("Editing user with employeeID " + employeeIDToEdit);

                // Prompt the admin to choose which data to edit
                print("Choose which data to edit:");
                print("1. First Name");
                print("2. Middle Name");
                print("3. Last Name");
                print("4. Gender");
                print("5. Birth Date");
                print("6. Username");
                print("7. Password");
                print("8. Job Title");
                print("9. Role (admin/manager/supervisor/operations)");
                print("0. Exit and Save Changes");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            print("Enter new First Name: ");
                            String newFirstName = scanner.nextLine();
                            userToEdit.setFirstName(newFirstName);
                            print("First Name updated.");
                            break;
                        case 2:
                            print("Enter new Middle Name: ");
                            String newMiddleName = scanner.nextLine();
                            userToEdit.setMiddleName(newMiddleName);
                            print("Middle Name updated.");
                            break;
                        case 3:
                            print("Enter new Last Name: ");
                            String newLastName = scanner.nextLine();
                            userToEdit.setLastName(newLastName);
                            print("Last Name updated.");
                            break;
                        case 4:
                            print("Enter new Gender: ");
                            String newGender = scanner.nextLine();
                            userToEdit.setGender(newGender);
                            print("Gender updated.");
                            break;
                        case 5:
                            print("Enter new Birth Date: ");
                            String newBirthDate = scanner.nextLine();
                            userToEdit.setBirthDate(newBirthDate);
                            print("Birth Date updated.");
                            break;
                        case 6:
                            print("Enter new Username: ");
                            String newUsername = scanner.nextLine();
                            userToEdit.setUsername(newUsername);
                            print("Username updated.");
                            break;
                        case 7:
                            print("Enter new Password: ");
                            String newPassword = scanner.nextLine();
                            userToEdit.setPassword(newPassword);
                            print("Password updated.");
                            break;
                        case 8:
                            print("Enter new Job Title: ");
                            String newJobTitle = scanner.nextLine();
                            userToEdit.setJobTitle(newJobTitle);
                            print("Job Title updated.");
                            break;
                        case 9:
                            print("Enter new Role (admin/manager/supervisor/operations): ");
                            String newRole = scanner.nextLine();
                            userToEdit.setRole(newRole);
                            print("Role updated.");
                            break;
                        case 0:
                            print("Changes saved.");
                            exit();
                            return; // Return to the Admin Dashboard
                        default:
                            print("Invalid choice. Please try again.");
                            break;
                    }

                } catch (InputMismatchException e) {
                    print("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // This is to prevent looping
                }
            }
        }
    }

    public void deleteAccount() {
        Scanner scanner = new Scanner(System.in);
        print("Enter the employeeID to delete the account: ");
        String employeeIDToDelete = scanner.nextLine();

        user userToDelete = null;

        // Search for the user by employeeID in the user list
        for (user u : userManager.getUserList()) {
            if (u.getEmployeeID().equals(employeeIDToDelete)) {
                userToDelete = u;
                break;
            }
        }

        if (userToDelete != null) {
            // Remove the user from the user list
            userManager.removeUser(userToDelete);

            // Inform the admin that the user has been deleted
            print("User deleted successfully.");
        } else {
            // If the user with the specified employeeID is not found
            print("User with employeeID " + employeeIDToDelete + " not found.");
        }
        exit();
    }

    public void modifyUserAccess() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print("Enter the employeeID to modify user access (role) or 'exit' to return to the Admin Dashboard: ");
            String employeeIDToModify = scanner.nextLine();

            if (employeeIDToModify.equalsIgnoreCase("exit")) {
                exit(); // Return to the Admin Dashboard
                return;
            }

            // Search for the user by employeeID in the user list
            user userToModify = null;
            for (user u : userManager.getUserList()) {
                if (u.getEmployeeID().equals(employeeIDToModify)) {
                    userToModify = u;
                    break;
                }
            }

            if (userToModify == null) {
                // If the user with the specified employeeID is not found
                print("User with employeeID " + employeeIDToModify + " not found.");
            } else {
                print("Modifying user access (role) for user with employeeID " + employeeIDToModify);

                // Prompt the admin to enter the new role
                print("Enter new Role (admin/manager/supervisor/operations): ");
                String newRole = scanner.nextLine();
                userToModify.setRole(newRole);

                // Inform the admin that the role has been updated
                print("Role updated.");
            }
        }
    }

    public void exit() {
        print("Returning to the Admin Dashboard.");
        // You can add any necessary cleanup or actions here
    }
}
