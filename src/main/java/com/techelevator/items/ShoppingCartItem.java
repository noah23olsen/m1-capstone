package com.techelevator.items;

public class ShoppingCartItem {
    private CandyStoreItem candyStoreItem;
    private int customerQuantitySelected;
    //getters and setters
    //candyStoreItem needs to be abel to take in user input  somehow, or no?
    //it hsa customerQuantitySelected
    //it needs to see customer

    public int getCustomerQuantitySelected() {
        return customerQuantitySelected;
    }

    public void setCustomerQuantitySelected(int customerQuantitySelected) {
        this.customerQuantitySelected = customerQuantitySelected;
    }

    public CandyStoreItem getCandyStoreItem() {
        return candyStoreItem;
    }

    public void setCandyStoreItem(CandyStoreItem candyStoreItem) {
        this.candyStoreItem = candyStoreItem;
    }



    //
}
