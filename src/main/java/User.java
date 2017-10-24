import java.util.ArrayList;

public class User  {



   private String userName;
    private String password;



    private ArrayList<Account> associatiedAccounts;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.associatiedAccounts = new ArrayList<Account>();
        UserDAO.getUserMap().put(this.getUserName(), this);
    }

    public ArrayList<Account> getAssociatiedAccounts() {
        return associatiedAccounts;
    }

    public void setPassword(String oldPassword, String newPassword) throws IncorrectPasswordException{
            IncorrectPasswordException.checkPassword(oldPassword, newPassword);
            password = newPassword;
    }
}
