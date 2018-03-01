package lesson8;

public class UserMain {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

        user1.name = "Pasha";
        user1.age = 25;

        user2.name = "Afdotiya";
        user2.age = 99;
        user2.city = "Muhosransk";

        System.out.println(user1.name + " : " + user1.age + " : " + user1.profession);
        System.out.println(user2.name + " : " + user2.age + " : " + user2.city + " : " + user2.profession2);

    }
}
