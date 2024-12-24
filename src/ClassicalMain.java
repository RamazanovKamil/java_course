import tatar.companiese.kamil.model.UserInfo;

public class ClassicalMain {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Kamil","Ramazanov",28);
        UserInfo user2 = new UserInfo("Michael", "Nickolas", 40);
        UserInfo user3 = new UserInfo("Michael", "Nickolas", 40);
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println(user2.equals(user3));
    }
}
