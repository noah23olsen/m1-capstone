package com.techelevator.view;

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



		System.out.println("Please select from the following options: ");
		System.out.println("(1) Show Inventory");
		System.out.println("(2) Make Sale");
		System.out.println("(3) Quit");

		String userInput = in.nextLine();  ///allows us to get user input

		if (userInput == "1"){

		}


    }
    public String getInventoryFileFromUser() {

        System.out.println("Enter an inventory file");

        return in.nextLine();
    }
}

