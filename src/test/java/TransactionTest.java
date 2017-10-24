import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TransactionTest {

    Transaction transaction;
    Transaction transaction2;
    @Before
    public  void setUp(){

        transaction = new Transaction(TransactionType.DEPOSIT, new BigDecimal(510.25));

        transaction2 = new Transaction(TransactionType.WITHDRAW, new BigDecimal(2122.99));
    }

    @Test
    public void testInstantiation(){


        assertEquals(TransactionType.DEPOSIT, transaction.getTransactionType());
        assertNotNull(transaction.getDate());
        assertTrue(transaction.getId() > 0);
        assertFalse(transaction.getId() == transaction2.getId());
        transaction2.toString();
        System.out.println(transaction.toString());
    }
}
