package homework6;

public class SimpleArrayAverage {
    public static void main(String[] args) {
        int [] ar = {1, 2, 3, 4, 5, 6, 7, 8};
        double sum = 0.0;

        for(int i: ar){
             sum += i;
        }
        System.out.println("Среднее: " + sum/ar.length);
    }


}
