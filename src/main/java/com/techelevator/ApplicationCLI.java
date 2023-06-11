package com.techelevator;

import com.techelevator.items.ShoppingCartItem;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Map;


/*
 * This class should control the workflow of the application, but not do any other work
 *
 * The menu class should communicate with the user, but do no other work
 *
 * This class should control the logical workflow of the application, but it should do no other
 * work.  It should communicate with the user (System.in and System.out) using the Menu class and ask
 * the CandyStore class to do any work and pass the results between those 2 classes.
 */
public class ApplicationCLI {

    CashRegister newCashRegister = new CashRegister();
    private CandyStore candyStoreInstance;
    private ShoppingCartItem shoppingCartItem = new ShoppingCartItem();



    /*
     * The menu class is instantiated in the main() method at the bottom of this file.
     * It is the only class instantiated in the starter code.
     * You will need to instantiate all other classes using the new keyword before you can use them.
     *
     * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
     */
    private Menu menu;

    public ApplicationCLI(Menu menu) {
        this.menu = menu;
    }

    /*
     * Your application starts here
     */
    public void run() {

        while (true) {


            String inventoryFileName = menu.getInventoryFileFromUser();
            try {
                candyStoreInstance = new CandyStore(inventoryFileName);
                break;
            } catch (FileNotFoundException e) {
                menu.tellUserFileNotFound();
            }

        }
        menu.showWelcomeMessage();

        while (true) {
            String userchoice = menu.getUserChoiceFromMenu();
            if (userchoice.equals("1")) {
                showInventory();

            } else if (userchoice.equals("2")) {  //2 -->  make sale
                //shows user and shows the sale menu
                condensedSaleMenu();
            } else menu.invalidSelection();
        }
    }


			/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Show Inventory,
				THEN show the candy store items for sale
			ELSE IF the User's Choice is Make Sale,
				THEN go to the make sale menu
			ELSE IF the User's Choice is Quit
				THEN break the loop so the application stops
			*/



    /*
     * This starts the application, but you shouldn't need to change it.
     */


    public void condensedSaleMenu() {
        while (true) {
            String userChoiceForSale = menu.showSaleMenu(newCashRegister.getCurrentCashRegisterBalance());//we want it to be 1, 2, or 3, otherwise return exception
            //we can make exception later
            if (userChoiceForSale.equals("1")) {   // take money
                //takes the amount the user wants to deposit, and assigns it to an amt as string
                userSelectedOneForMakeSaleMenu();
                ;
                // changing user input and store it as a sting and set it as int
            } else if (userChoiceForSale.equals("2")) {
                userSelectTwoForMakeSaleMenu();
            }
        }
    }

    public void userSelectedOneForMakeSaleMenu() {
        String amountAsString = menu.promtUserAnAMountToDeposit();
        //takes amt as string, parses to an integer
        int amountAsIntegeer = Integer.parseInt(amountAsString);
        //once the value is an intger, we call the deposit method on it
        try {
            newCashRegister.depositMoney(amountAsIntegeer);
        } catch (InvalidDepositException e) {
            menu.depositAmountInvalid();
        }
    }

    public void userSelectTwoForMakeSaleMenu(){
        showInventory();

        String idUserEntered = menu.promptUserToEnterAnId().toUpperCase();

        int getQuantityOfKey  = candyStoreInstance.getInventory().get(idUserEntered).getQuantity();

        if (candyStoreInstance.getInventory().containsKey(idUserEntered)) {
            menu.tellUserItemWasAvailable();

            int userQuantity  = Integer.parseInt(menu.promptUserToEnterAQuantity());
            boolean userCanGetQuantity = getQuantityOfKey-userQuantity >= 0;

                if (getQuantityOfKey == 0) {
                    menu.quantityIsSoldOut();
            }
                else if (userQuantity < 0) {
                    menu.insufficientStock();
                }
                else if (getQuantityOfKey - userQuantity < 0) {
                    menu.insufficientStock();
                }
             //if all else true, now we need to check the balance
                //if usercangetquantity && the key is true(bc its in the if statement)
                else if(userCanGetQuantity){
                    if(newCashRegister.getCurrentCashRegisterBalance() >= getQuantityOfKey * candyStoreInstance.getInventory().get(idUserEntered).getPrice()) {
                        //we need to update the cash balance
                 double updatingBalance= newCashRegister.getCurrentCashRegisterBalance() - userQuantity * candyStoreInstance.getInventory().get(idUserEntered).getPrice();
                 newCashRegister.setCurrentCashRegisterBalance(updatingBalance);
//item . add to list ,
                        //we need to make a list in custoemr cart


                        candyStoreInstance.getInventory().get(idUserEntered).setQuantity(getQuantityOfKey - userQuantity);

                    }
            }

        } else
            menu.tellUserItemWasNotAvailable();
        //if (id exists as the inventory key)
        //id in the inventory map is stored as the key
        //quantity is stored in the inventory map as ivnetnory.getvalue(which is i think inventory.getCandyItem.getQuantity
    }
        public static void main (String[]args){
            Menu menu = new Menu();
            ApplicationCLI cli = new ApplicationCLI(menu);
            cli.run();

        }

        public void showInventory () {
            Map<String, CandyItem> inventory = candyStoreInstance.getInventory();
            menu.displayInventory(inventory);
        }
        //what we do we want to add to the list
    //we can start by adding product name and product quantity selected

    }