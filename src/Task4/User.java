package Task3;

public class User {
    String name;
    String user;

    User(String user, String name) {
        this.user = user;
        this.name = name;
        String str = getName(user, name);
        System.out.println(str);
    }


    private String getName(String user, String name) {
        return user + ": " + name;
    }
}
