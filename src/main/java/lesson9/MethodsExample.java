package lesson9;

public class MethodsExample {

    public static void main(String[] args) {
        int square = getSquare();
        System.out.println(square);

        MeowExample cat = new MeowExample();
        cat.meow();
        cat.meow(3);
        cat.meow(3, 1);
        cat.meow(4500.23);



    }

    public static int getSquare(){

        return 3*5;


    }

}
