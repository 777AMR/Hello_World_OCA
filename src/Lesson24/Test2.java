package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolvoStoron);
        f1.ploshad();
    }
}

abstract class Figura {

    int kolvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {

    int kolvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + kolvoStoron * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1 * storona1);
    }
}

class Okruzhnost extends Figura {
    int kolvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okruzhnosti = " + 2 * 3.14159265 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okruzhnosti = " + 3.14159265 * radius * radius);
    }
}

abstract class Chetirehugolnik extends Figura {
    void def() {
        System.out.println("Eto chetirehugolnik");
    }
}