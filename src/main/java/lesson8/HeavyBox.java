package lesson8;

public class HeavyBox extends Box {
    public HeavyBox(double width, double heigth, double depth, int weight) {
        super(width, heigth, depth);
        this.weight = weight;
    }

    int weight;

    public void printInfo(){
        System.out.println("Объем коробки " + getVolume());
        System.out.println("Вес коробки " + weight);
    }

}
