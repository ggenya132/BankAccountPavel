import java.math.BigDecimal;

public class OverdraftException extends  Exception {

    public  OverdraftException(){
        System.out.println("Transaction cannot be completed. This withdrawal will overdraft the account");
    }

    public static void checkDeposit (BigDecimal bigDecimal, Account account) throws OverdraftException{
        if(account.getBalance().subtract(bigDecimal).longValue()<0){
            throw new OverdraftException();
        }
    }
}
