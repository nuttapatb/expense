
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestAccount {

    private Account account;
    @BeforeEach
    public void init(){
        account = new Account(0,0);
    }

    @Test
    public void test_addIncome(){
        account.addIncome(500);
        assertEquals(500,account.getBalance());
    }

    @Test
    public void test_payMoney(){
        account.payMoney(500);
        assertEquals(-500,account.getBalance());
    }

}
