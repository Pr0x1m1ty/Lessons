package lesson11;

public class FinalyExample {
    public static void main(String[] args) {

    }

    public static void procA(){
        try{
            System.out.println("inside procA");
            throw  new RuntimeException("demo");

        }finally {
            System.out.println("procA is finally");
        }
    }
}
