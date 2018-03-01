package homework6;

public class SimpleArraysScnd {
    public static void main(String[] args) {

        int [] ar = {1, 1, 2, 5, 664, 234, 664, 2, 10};

        int min = ar[0];
        int min2 = ar[0];
        int max = ar[0];

        for(int i:ar){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;

            }
            if(ar[1] == min){
              min = min2;
                System.out.println("Min int in array: " + min2);
            }

        }
        System.out.println("Min int in array: " +min);
        System.out.println("Max int in array: " +max);



    }
}
