package lesson4.loops.Conditions;

import java.util.Scanner;

public class DaysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        System.out.println("7 - Sunday");

        System.out.println("Select number: ");

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("Net nah!");
                break;
        }
    }

}
