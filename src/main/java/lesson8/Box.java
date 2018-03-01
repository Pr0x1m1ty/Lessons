package lesson8;

public class Box {

    public double width;
    public double heigth;
    public double depth;
    public String name;


    public String getVolume(){
        return "Объем коробки = " + (width*heigth*depth);
    }


    public void printInfo(){
        System.out.println(getVolume());
    }

    public Box(double depth){
        this.depth = depth;

    }


    public Box(double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    public Box(double width, double heigth, double depth, String name) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
        this.name = name;
    }
}
