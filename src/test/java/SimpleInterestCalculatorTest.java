import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SimpleInterestCalculatorTest {

    @Mock
    InterestAccount interestAccount;

    SimpleInterestCalculator simpleInterest;
    @Before
    public void setUp(){
        Date mockDate = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();

        when(interestAccount.getOpenDate()).thenReturn(mockDate);
        when(interestAccount.getBalance()).thenReturn(new BigDecimal(2000));
        when(interestAccount.getInterestRate()).thenReturn(new BigDecimal(.006));
        simpleInterest = new SimpleInterestCalculator();

    }

    @Test
    public void testCalculator(){
        System.out.println(SimpleInterestCalculator.calculateAccruedInterest(interestAccount));
    }
}
