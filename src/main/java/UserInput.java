import java.math.BigDecimal;
import java.util.Scanner;

public   class UserInput {
    Scanner scanner = new Scanner(System.in);

    public String getUserName(){
        System.out.println("Enter user-name");
        return scanner.nextLine();
    }
    public String getPassword(){

        System.out.println("Enter password");
        return scanner.nextLine();
    }

    public String getAccountType(){
        System.out.println("Select account type: Checking or Saving");

        return scanner.nextLine();
    }

    public BigDecimal getInitialDeposit(){

        System.out.println("Enter initial deposit ('0' is a valid number)");
        return new BigDecimal(Double.parseDouble(scanner.nextLine()));
    }
}
