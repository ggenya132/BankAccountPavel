import org.joda.time.DateTime;
import org.joda.time.Days;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    public static BigDecimal calculateAccruedInterest(InterestAccount interestAccount){

       int daysBetweenOpenAndCurrentTime = Days.daysBetween(new DateTime(interestAccount.getOpenDate()), new DateTime()).getDays();
       double percentageOfInterest = daysBetweenOpenAndCurrentTime/365;

        double moneyEarned  = (interestAccount.getBalance().doubleValue() * (1+(interestAccount.getInterestRate().doubleValue() * percentageOfInterest)) - interestAccount.getBalance().doubleValue());
        return new BigDecimal(moneyEarned);

    }
}
