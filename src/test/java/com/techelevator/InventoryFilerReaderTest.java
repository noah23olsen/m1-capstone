package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Map;

public class InventoryFilerReaderTest {

    private InventoryFileReader target;

    @Before
    public void setup() {
        target = new InventoryFileReader("inventory.csv");
    }

    @Test
    public void load_inventory_from_file() throws FileNotFoundException {
        Map<String, CandyItem> inventory = target.loadInventory();
        Assert.assertEquals(18, inventory.size());
    }

}
