import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

 TransactionType transactionType;
 BigDecimal amount;
 Date date;
 Long id;

    public Long getId() {
        return id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }



    public Date getDate() {
        return date;
    }



    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    private Transaction(){}
    public  Transaction(TransactionType transactionType, BigDecimal amount){
        this.date = new Date();
        this.transactionType = transactionType;
        this.amount = amount.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        this.id = TransactionIdFactory.getId();
    }
    @Override
    public String toString(){

        return "Transaction amount: " + getAmount() + ", Transaction type: " + getTransactionType() + ", Transaction date: " + getDate();
    }
}
