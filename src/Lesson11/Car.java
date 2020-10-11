package Lesson11;

public class Car {
    String color;
    String engine;
    int dver;

    public Car(String color, String engine, int dver) {
        this.color = color;
        this.engine = engine;
        this.dver = dver;
    }
}

class CarTest {

    void setCar(Car c, int dver2) {
        c.dver = dver2;
    }

    void setDver(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        Car car1 = new Car("red", "V4", 3);
        Car car2 = new Car("black", "V12", 5);
        carTest.setCar(car1, 5);
        carTest.setDver(car1, car2);
        System.out.println(car1.color + " " + car1.engine + " " + car1.dver + "\n");
        System.out.println(car2.color + " " + car2.engine + " " + car2.dver + "\n");
    }
}


