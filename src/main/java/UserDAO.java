import java.util.HashMap;

public class UserDAO {

    static {

        userMap = new HashMap<String, User>();
    }

    private static HashMap<String, User> userMap;

    public static HashMap<String, User> getUserMap() {
        return userMap;
    }
}
