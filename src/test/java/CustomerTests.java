import com.techelevator.Customer;
import org.junit.*;
public class CustomerTests {
    private Customer target;

    @Before
    public void setup() {
        target = new Customer();
    }


    @Test
    public void test_if_deposit_works_if_valid () {
        //we need to test if deposit thing is valid
        double testResult = target.depositMoney(10);
        Assert.assertEquals(10,testResult,0.00);
    }
    //this should fail
    @Test
    public void test_if_deposit_amount_is_over_100 () {
        //we need to test if deposit thing is valid
        double testResult = target.depositMoney(101);
        Assert.assertEquals(0,testResult,0.00);
    }
    @Test
    public void test_if_currentAcc_equates_to_over_1000 () {
        //we need to test if deposit thing is valid
        double testResult = target.depositMoney(1001);
        Assert.assertEquals(0,testResult,0.00);
    }

    @Test
    public void test_if_currentAcc_equates_to_over_999 () {
        //we need to test if deposit thing is valid
        double testResult = target.depositMoney(99);
        Assert.assertEquals(99,testResult,0.00);
    }

    @Test
    public void test_if_currentAcc_equates_to_less_than_0 () {
        //we need to test if deposit thing is valid
        double testResult = target.depositMoney(99);
        Assert.assertEquals(900,testResult,0.00);
    }

}
