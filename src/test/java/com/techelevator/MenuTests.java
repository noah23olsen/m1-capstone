package com.techelevator;

import com.techelevator.view.Menu;
import org.junit.*;

public class MenuTests {
    private Menu target;



    @Before
    public void setup() {
        target = new Menu();
    }


    @Test
    public void test_if_user_selection_is_invalid () {

       String testingVal = target.getUserChoiceFromMenu();
       Assert.assertEquals("a",testingVal,1);

    }
}
