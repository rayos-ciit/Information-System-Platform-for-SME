/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt4rayosg12;

import static com.mycompany.pt4rayosg12.Pt4rayosg12.print;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class manager extends user {

    private userInfo userManager;

    public manager(userInfo userManager) {
        this.userManager = userManager;
    }

    public void managerDashboard(user authenticatedUser) {
        if (!"manager".equals(authenticatedUser.getRole())) {
            print("You don't have permission to access the Manager Dashboard.");
            return;
        }
        
    Scanner scanner = new Scanner(System.in);

//    private static void managerDashboard(user managerUser) {
//        print("Manager Dashboard");
//        // Manager-specific actions
//    }

    }
    
    private void viewSalesRecords(){
        
    }
    
    private void updateSalesRecords(){
        
    }

}
