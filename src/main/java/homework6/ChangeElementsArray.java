package homework6;

public class ChangeElementsArray {
    public static void main(String[] args) {
        int [] ar = {4, -5, 0, 6, 8};
        int nMin = 0;
        int nMax = 0;

        int max = ar[0];
        int min = ar[0];

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] > max) {
                max = ar[i];
                nMax = i;
            }
            if (ar[i] < min) {
                min = ar[i];
                nMin = i;
            }
        }
        int tmp = ar[nMax];
        ar[nMax] = ar[nMin];
        ar[nMin] = tmp;

        for (int item: ar) {
            System.out.print(item + ",");
        }

    }









}
