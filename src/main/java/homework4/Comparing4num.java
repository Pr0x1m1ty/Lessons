package homework4;

public class Comparing4num {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 8;
        int d = 1;

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("А - наименьшее");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("B - наименьшее");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("С - наименьшее");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("D - наименьшее");
        }

    }

}
