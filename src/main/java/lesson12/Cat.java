package lesson12;

public class Cat extends Pet {

    @Override
    public void voice(){
        System.out.println("Meow meow");
        isHungry = true;
    }

    @Override
    public void move() {
        if (isHungry) {
            System.out.println("Жрать");

        }
    }

}
