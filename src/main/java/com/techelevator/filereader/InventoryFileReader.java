package com.techelevator.filereader;

import com.techelevator.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
            while (fileScanner.hasNextLine()) {
                String lineFromFile = fileScanner.nextLine();
                //making a new candy item for each line
                CandyItem  newCandyItem = buildStoreItemFromLine(lineFromFile);
                inventory.put(newCandyItem.getId(),newCandyItem);
            }
        }
        return inventory;
    }

    private CandyItem buildStoreItemFromLine(String lineFromFile) {
        String[] itemParts = lineFromFile.split("\\|");

        String productCode = itemParts[0];
        String id = itemParts[1];
        String name = itemParts[2];
        double price = Double.parseDouble(itemParts[3]);
        String isIndividuallyWrapped = itemParts[4];

        CandyItem item = null;

        if (productCode.equalsIgnoreCase("CH")) {
            item = new Chocolates();
        } else if (productCode.equalsIgnoreCase("HC")) {
            item = new HardCandy();
        } else if (productCode.equalsIgnoreCase("LI")) {
            item = new Licorice();
        } else if (productCode.equalsIgnoreCase("SR")) {
            item = new Sours();
        }

        item.setId(id);
        item.setName(name);
        item.setIndividuallyWrapped(isIndividuallyWrapped);
        item.setPrice(price);

        return item;

    }
}