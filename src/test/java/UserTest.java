import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class UserTest {

    User user;
   @Before
    public void setUp(){
        user = new User("ggenya", "password");

    }

    @Test
    public void testArray(){
        user.getAssociatiedAccounts().add(new Account(new BigDecimal(0)));

    }


    public void testSetPassword() throws Exception{
        user.setPassword("password", "3Softtacos");

    }

    @Test(expected = IncorrectPasswordException.class)
    public void testExceptionTest() throws Exception{
        user.setPassword("notThePassword", "password");
    }
}
