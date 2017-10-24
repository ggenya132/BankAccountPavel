import java.math.BigDecimal;
import java.util.ArrayList;

public class Account {

    private ArrayList<Transaction> transactionHistory;
    private BigDecimal balance = new BigDecimal(0);
    private Long accountId;

    public Long getAccountId() {
        return accountId;
    }

    public Transaction deposit(BigDecimal amount){

        Transaction deposit = new Transaction(TransactionType.DEPOSIT, amount);
        balance = balance.add(amount);
        transactionHistory.add(deposit);
        return deposit;
    }

    public Transaction withDraw(BigDecimal amount) throws  Exception{
        OverdraftException.checkDeposit(amount, this);
        Transaction withdrawal = new Transaction(TransactionType.WITHDRAW, amount);
        balance = balance.subtract(amount);
        transactionHistory.add(withdrawal);
        return withdrawal;
    }

    public Account(BigDecimal intialDeposit){
        balance = new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        transactionHistory = new ArrayList<Transaction>();
        balance = balance.add(intialDeposit);
        accountId = AccountIdFactory.getId();
        AccountDAO.getAccountMap().put(this.getAccountId().toString(), this);
    }

    String printAccountHistory(){
        String history = "Account history: " + "\n";
        for(Transaction transaction : transactionHistory){
        history += transaction.toString() + "\n";
        }
        return history;
    }

    public BigDecimal getBalance() {
       return balance.setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    @Override
    public String toString(){
        return  "Account information: \n" + "Balance: " + getBalance() + "\n" + "Account-ID: " + getAccountId() + "\n" + printAccountHistory();
    }
}
