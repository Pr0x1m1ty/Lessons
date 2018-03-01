package lesson2;

public class DatatypesCast {

    public static void main(String[] args) {
         int i = 60;

         long lo = i;

         short s = (short) lo;

        System.out.println(s);

        char ch = 'J';
        int intCh = (int) ch;

        System.out.println("J corresonds with  " + intCh);




        double b = 2.6;

        int c = (int) (0.5 + b);

        System.out.println(c);
        System.out.println((int)9.69);
        System.out.println((int)'A');
        System.out.println((double)3);
    }
}
