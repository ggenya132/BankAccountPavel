public class AccountHandler {
    public static void associateAccount(String userName, String accountId ){
        UserDAO.getUserMap().get(userName).getAssociatiedAccounts().add(AccountDAO.getAccountMap().get(accountId));
    }
}
