package lesson4.loops.Conditions;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - print Jack");
        System.out.println("2 - print Biber");
        System.out.println("3 - print Hulk");
        System.out.println("4 - print Obama");
        System.out.println("5 - print Putin");
        System.out.println("Select number: ");

        int choise = scanner.nextInt();
        if(choise == 1){
            System.out.println("Jack Daniels");
        }else if(choise == 2){
            System.out.println("Justin Bieber mudak");

        }else if(choise == 3){
            System.out.println("Hulmk Smaaash");
        }else if(choise == 4){
            System.out.println("Prosto Obama");
        }else if(choise == 5){
            System.out.println("Putin Huilo");

        }else {
            System.out.println("Aaaaa Pofig");
        }
    }
}
