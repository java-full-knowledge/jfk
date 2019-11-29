package Registrations_forma;
@FunctionalInterface
interface iterable {
    int sum(int a, int b);
}

public class UserRegistrationsForma {


    public static void main(String[] args) {


        User user1 = new User("arman", "torosyan", "xxxx", new String[]{"077169666", "098656566"});
        User user2 = new User("karen", "vardanyan", "yyyy", new String[]{"077789988"});
        User user3 = new User("vardan", "tonoyan", "zzzz", new String[]{"094345666"});
        UserService userService = new UserService(3);
        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        System.out.println(userService);
        userService.delete(user2);
        System.out.println(userService);

    }
}
