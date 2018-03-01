package lesson12;

public class Dog extends Pet {

    @Override
    public void voice(){
        System.out.println("Gaf gaf");
        isHungry = true;
    }

    @Override
    public void move(){
        if(isHungry){
            System.out.println("I need food");
            return;
        }
        System.out.println("Ok, I'll walk...");
    }
}
