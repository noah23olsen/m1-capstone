package com.techelevator.view;

import com.techelevator.CandyItem;

import java.util.Map;
import java.util.Scanner;

/*
 * This is the only class that should have any usage of System.out or System.in
 *
 * Usage of System.in or System.out should not appear ANYWHERE else in your code outside of this class.
 *
 * Work to get input from the user or display output to the user should be done in this class, however, it
 * should include no "work" that is the job of the candy store.
 */
public class Menu {

    private static final Scanner in = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("***************************");
        System.out.println("**     Silver Shamrock   **");
        System.out.println("**      Candy Company    **");
        System.out.println("***************************");
        System.out.println();



        ///allows us to get user input


    }
    public String getUserChoiceFromMenu() {
        System.out.println("Please select from the following options: ");
        System.out.println("(1) Show Inventory");  //___> current status
        System.out.println("(2) Make Sale");
        System.out.println("(3) Quit");
        return in.nextLine();
    }
    public void invalidSelection(){
        System.out.println("Invalid selection");
    }


    public String getInventoryFileFromUser() {

        System.out.println("Enter an inventory file");

        return in.nextLine();
    }

    public void tellUserFileNotFound() {
        System.out.println("this file was not found");
    }

    public void displayInventory(Map<String, CandyItem> inventory) {
        for (Map.Entry<String, CandyItem> entry : inventory.entrySet()) {
            System.out.printf("%1s : %1s : $%1.2f %n", entry.getKey(),
                    entry.getValue().getName(), entry.getValue().getPrice());


        }

    }
}

