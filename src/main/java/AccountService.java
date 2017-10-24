import java.math.BigDecimal;

public class AccountService {
    UserInput userInput = new UserInput();
    public void addAccount(){

        String accountType = userInput.getAccountType();
        BigDecimal initialDeposit = userInput.getInitialDeposit();
        Account account = new Account(initialDeposit);
        AccountDAO.getAccountMap().put(account.getAccountId().toString(), account);
        System.out.println(account.toString());
    }
}
