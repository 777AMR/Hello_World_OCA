package Lesson9;

public class Car {

    int z = 5;
    String color;
    public static int ab = 10;
    String engine;
    public static int count;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        int a = 10;
    }
}
