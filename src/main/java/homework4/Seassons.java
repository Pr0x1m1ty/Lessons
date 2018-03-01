package homework4;

public class Seassons {
    public static void main(String[] args) {
        int x = 66;

        if(x >= 1 && x <= 59 && x >= 335 && x <= 365){
            System.out.println("Winter");
        }else if(x > 59 && x < 149){
            System.out.println("Spring");
        }else if(x >= 149 && x < 239 ){
            System.out.println("Summer");
        }else if(x >= 239 && x < 335){
            System.out.println("Autumn");
        }
    }
}
