import java.math.BigDecimal;
import java.util.Date;

public class InterestAccount extends Account {

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Date openDate;

    public BigDecimal getInterestRate() {

        return interestRate;
    }


    public InterestAccount(BigDecimal initialDeposit, BigDecimal interestRate){
        super(initialDeposit);
        this.interestRate = interestRate.setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    public Date getOpenDate() {
        return openDate;
    }

    private BigDecimal interestRate;
}
