package com.techelevator.items;

import com.techelevator.CandyItem;
import com.techelevator.CandyStore;

public class ShoppingCartItem {
    private CandyItem candyStoreItem;
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

    public CandyItem getCandyStoreItem() {
        return candyStoreItem;
    }

    public void setCandyStoreItem(CandyItem candyStoreItem) {
        this.candyStoreItem = candyStoreItem;
    }



    //
}
