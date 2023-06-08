package com.techelevator.filereader;

import com.techelevator.CandyItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;
    }

    public Map<String, CandyItem> loadInventory() throws FileNotFoundException {
        Map<String, CandyItem> inventory = new LinkedHashMap<>();
        File inventoryFile = new File(inventoryFileName);

        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine())  {
                String lineFromFile = fileScanner.nextLine();

            }
        }
    }
}
