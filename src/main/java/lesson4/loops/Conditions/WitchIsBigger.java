package lesson4.loops.Conditions;

import java.util.Scanner;

public class WitchIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ну удиви: ");
        int a = scanner.nextInt();

        int b = scanner.nextInt();


        if(a > b){
            System.out.println("У меня больше!");

        }
        else if(a < b) {
            System.out.println("У меня все равно больше!");
        }
        else if(a == b) {
            System.out.println("Да пофиг, у меня больше");
        }

    }
}
