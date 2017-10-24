import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountTest {
    Account account;

    @Before
    public synchronized void setUp() throws Exception
    {
        account = new Account(new BigDecimal(500));
        synchronized (account) {
            account.wait(3000);
        }
        account.deposit(new BigDecimal(700.29));
        synchronized (account) {
            account.wait(3000);
        }
        account.withDraw(new BigDecimal(225));

        synchronized (account) {
                account.wait(3000);
            }

         account.deposit(new BigDecimal(700.500));


    }

    @Test
    public void printTransacionHistoryTest(){

        System.out.println(account.printAccountHistory());
        System.out.println(account.getBalance());
    }

    @Test(expected = OverdraftException.class)
    public void testException() throws Exception{
        account.withDraw(new BigDecimal(3000));
    }

}
