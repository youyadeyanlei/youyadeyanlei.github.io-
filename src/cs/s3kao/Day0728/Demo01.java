package cs.s3kao.Day0728;

import cs.s3kao.s3.User;

import java.util.List;

public class Demo01 {
    public static void main(String[] args) {

        List<User> users =generateUsers();
        show(users,(user)-> System.out.println(user));
        show(users,System.out::println);
    }

    private static List<User> generateUsers() {
        return null;
    }

    public static void show(List<User> list,ShowInfo showInfo){
        for (User user : list) {
            showInfo.showUser(user);
        }
    }
}
