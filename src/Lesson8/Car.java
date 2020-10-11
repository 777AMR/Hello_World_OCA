package Lesson8;

public class Car {
    final static double Pi = 3.14159265358979323846264338327650;

    public double ploshadKruga(double radius) {
        double pl = Pi * radius * radius;
        return pl;
    }

    public static double dlina(double radius2) {
        double dl = 2 * Pi * radius2;
        return dl;
    }

    public void info(double radius) {
        System.out.println("Radius = " + radius);
        System.out.println("Ploshad = " + ploshadKruga(radius));
        System.out.println("Dlina = " + dlina(radius));
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car z = new Car();
        z.ploshadKruga(5);
        Car.dlina(5);
        z.info(5);
    }
}
