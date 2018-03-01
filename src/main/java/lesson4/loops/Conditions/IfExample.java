package lesson4.loops.Conditions;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Жги: ");
        int inputInt = scanner.nextInt();
        if(inputInt == 300){
            System.out.println("Joke about the tractor driver");
        }
        System.out.println("Your int is "+inputInt);

    }
}
