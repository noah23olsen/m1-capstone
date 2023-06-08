package com.techelevator;
import com.techelevator.filereader.InventoryFileReader;

import java.io.FileNotFoundException;
import java.util.Map;

/*
    This class should encapsulate all the functionality of the Candy Store application, meaning it should
    contain all the "work"
 */
public class CandyStore {

    public CandyStore (String inventoryFilename) throws FileNotFoundException {
        InventoryFileReader inventoryReader = new InventoryFileReader(inventoryFilename);
        inventory = inventoryReader.loadInventory();
    }


    public void showInventory(){


    }
    private Map <String, CandyItem> inventory;
    public Map<String, CandyItem> getInventory() {
        return this.inventory;
    }


}
