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
    public String showSaleMenu(double balance){
        System.out.println("(1) Take Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Sale");
        System.out.println("Current Customer Balance: " + balance  );
         return in.nextLine();


    }
    public String promtUserAnAMountToDeposit(){
        System.out.println("Please enter an amount to deposit in the account");
        return in.nextLine();
    }
    public void depositAmountInvalid () {
        System.out.println("Please try again. please ");
    }

    public String getInventoryFileFromUser() {

        System.out.println("Enter an inventory file");
//TODO TESTING REMOVE LATE R
        //return in.nextLine();
        return "inventory.csv";
    }

    public void tellUserFileNotFound() {
        System.out.println("this file was not found");
    }

    public String promptUserToEnterAnId() {
        System.out.println("Please enter an ID: ");
        return in.nextLine();

    }
    public void tellUserItemWasAvailable() {
        System.out.println("Item was available");
        System.out.println();
    }
    public void tellUserItemWasNotAvailable() {
        System.out.println("Item was not available");
        System.out.println();
    }

    public String promptUserToEnterAQuantity() {
        System.out.println("Please enter a Quantity: ");
        return in.nextLine();

    }
    public void quantityIsSoldOut() {
        System.out.println("quantity is sold out!");
    }
    public void insufficientStock() {
        System.out.println("insufficient stock!");
        System.out.println();
    }





    public void displayInventory(Map<String, CandyItem> inventory) {

        System.out.printf("%-13s %-18s %-13s  %-13s %-13s\n", "ID", "Name", "Wrapper", "Qty", "Price");
        System.out.println();
        for (Map.Entry<String, CandyItem> entry : inventory.entrySet()) {
            System.out.printf("%-13s %-18s %-13s  %-13s %-13s\n", entry.getKey(),
                    entry.getValue().getName(), entry.getValue().getIsIndividuallyWrapped(),quantitySoldOut(entry.getValue()), entry.getValue().getPrice());


        }

    }
    private String quantitySoldOut (CandyItem item) {
        //check if inventory is over 100, it CANT, we need to show this somehow
        if (item.getQuantity() == 0) {
            return "Sold out";
        }
        else {
            return String.valueOf(item.getQuantity());
        }
    }
//selecting SELECT PRODUCTS, (if select 2 . equals 2) in the make sale method...
    //show inventory
    //prompt user to enter an ID
    //how do we check if ID exists?  like .contains?
    //IF iD doesnt exist, throw exception of like "invalid product"(or make a method saying it doesnt exist, and call it in the CLI

    //prompt user to enter quantity

    //if item.getQuantity = 0,
    //make a method in main printing sold out, and call it in the CLI

    //oh, when prompted to enter value, we should check it in shopping cart item, the customer inputs an id, and MAYBE a quantity?(yea, we need a product and quantity(user selects product and quantity)

    //if item.getquantity> quantityUserRequested , tell user insufficient stock(this shouldbe in the same while loop as other one...
    //call method in main menu, printing insufficient stock

    //if customer.getBalance < item.getId.getPrice * item.getQUanaity),return insufficient funds
    //(idk how we will have access to this, do we perform this in candy store...? )

    //if prompted ID = true (assign to variable string probably, idk) && cstom.getBalance >   item.getId.getPrice * item.getQuantity,
    //item.add to LIST in customer cart? , customerBalance = - item.getId.getPrice * item.getQuantity,
    //update the quantity of the product
    //theres two quantities: the quantity user requested, and the quantity of the item remaining
    //"ADD ITEM TO USERS CART"

    //then return user to makesale menu, customerBalance should be updated, make new instance of customer???? inside, like copy the same thing we did for the other one...


    //users cannot remove items from the cart
    //ok....
    //so then return to makesale menu









}

