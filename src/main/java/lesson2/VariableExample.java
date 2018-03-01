package lesson2;

public class VariableExample {
    public static void main(String[] args) {

        int myNumber = 10;
        int mySecondNumber = 20;
        int result = myNumber + mySecondNumber;

        System.out.println("Result = " + result);

        String word = "Hello";
        String firstName = "Jack";
        String lastName = "Sparrow";
        String phrase = word + firstName + lastName;

        System.out.println("Phrase = " + phrase);

        System.out.println();

        System.out.println("Phrase with space: "+word+" "+firstName+" "+lastName+"!");


    }

    public class MyConstant {
        public static final String USER_EMAIL = "jack@sparrow.com";
        public static final String USER_PASSWORD = "iLoveJustinBieber";

    }
    }
