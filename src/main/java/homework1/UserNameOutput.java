package homework1;

import java.util.Scanner;

public class UserNameOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your  name:");

        String s = scanner.nextLine();

        System.out.println("Greetings, " + s + " !");

    }
}
