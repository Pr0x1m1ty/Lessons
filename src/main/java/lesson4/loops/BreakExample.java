package lesson4.loops;

public class BreakExample {
    public static void main(String[] args) {

        for(int a=1; a<10; a++){
            if(a == 5){
                break;
            }
            System.out.println(a + "");
        }
        System.out.println("The End");
    }
}
