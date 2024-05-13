package Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new Admin("admin", "Alex");
        User user1 = new Moderator("moderator", "Singa");
        User user2 = new User("user", "Shea");
        System.out.println();
        User[] arr = {user2, user1, user};
        for (User value : arr) {
            System.out.println(value.user + ": " + value.name);
        }

    }
}