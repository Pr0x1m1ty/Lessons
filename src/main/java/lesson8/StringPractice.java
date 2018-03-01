package lesson8;

public class StringPractice {
    public static void main(String[] args) {

        int i1 = 1;
        String s1 = String.valueOf(i1);

        double i2 = 1.0;
        String s2 = String.valueOf(i2);

        long i3 = 1l;
        String s3 = String.valueOf(i3);

        boolean ib = true;
        String ib1  = String.valueOf(ib);

        String s4 = "4";
        int i4 = Integer.valueOf(s4);

        String s5 = "1234.1";
        double i5 = Double.valueOf(s5);

        String s6 = "14311l";
        long i6 = Long.valueOf(s6);

        System.out.println("Int -> String: " + i1 + " ->" + s1);
        System.out.println("Double -> String: " + i2 + " ->" + s2);
        System.out.println("Long -> String: " + i3 + " ->" + s3);
        System.out.println("Boolean -> String: " + ib + " ->" + ib1);




    }
}
