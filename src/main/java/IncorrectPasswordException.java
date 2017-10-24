public class IncorrectPasswordException  extends Exception{

    public IncorrectPasswordException(){
        System.out.println("Incorrect password");
    }

    public static void checkPassword(String newPassword, String oldPassword) throws IncorrectPasswordException{
        if(!newPassword.equals(oldPassword)){
            throw new IncorrectPasswordException();
        }
    }
}
