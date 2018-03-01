package homework4;

public class Comparing5num {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int c = 8;
        int d = 1;
        int e = 9;

        if ((a < b) && (a < c) && (a < d) && (a < e)) {
            System.out.println(a);
        } else if ((b < a) && (b < c) && (b < d) && (b < e)) {
            System.out.println(b);
        } else if ((c < a) && (c < b) && (c < d) && (c < e)) {
            System.out.println(c);
        } else if ((d < a) && (d < b) && (d < c) && (d < e)) {
            System.out.println(d);
        } else if ((e < a) && (e < b) && (e < c) && (e < d)) {
            System.out.println(e);

        }

        if ((a > b) && (a > c) && (a > d) && (a > e)) {
            System.out.println(a);
        } else if ((b > a) && (b > c) && (b > d) && (b > e)) {
            System.out.println(b);
        } else if ((c > a) && (c > b) && (c > d) && (c > e)) {
            System.out.println(c);
        } else if ((d > a) && (d > b) && (d > c) && (d > e)) {
            System.out.println(d);
        } else if ((e > a) && (e > b) && (e > c) && (e > d)) {
            System.out.println(e);
        }

    }
}
