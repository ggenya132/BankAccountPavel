import java.util.HashMap;

public class AccountDAO {

    static {

        accountMap = new HashMap<String, Account>();
    }

    private static HashMap<String, Account> accountMap;

    public static HashMap<String, Account> getAccountMap() {
        return accountMap;
    }
}
