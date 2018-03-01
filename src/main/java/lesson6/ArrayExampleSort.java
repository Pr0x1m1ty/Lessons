package lesson6;

import java.util.Arrays;

public class ArrayExampleSort {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 2, 4};


        Arrays.sort(a);

        System.out.println("Sorted: \n" + Arrays.toString(a));
    }
}
