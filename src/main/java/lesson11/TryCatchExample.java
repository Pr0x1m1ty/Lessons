package lesson11;

public class TryCatchExample {

    public static void main(String[] args) {

        int a = 4;
        try {
            System.out.println(a/0);

        }catch (ArithmeticException e){
        }
    }
}
