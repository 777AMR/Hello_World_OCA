package Lesson24;

abstract class Animal4 {
    String name;

    Animal4(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal4 {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() { System.out.println("Vsegda interesno nabludat, kak spyat ribi"); }
    abstract void swim();
}

abstract class Bird extends Animal4 implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();
    public void speak() { System.out.println(name + " sings"); }
}

abstract class Mammal extends Animal4 implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() { System.out.println("Somebody speaks"); }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() { System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!"); }
    public void eat() { System.out.println("Mechenosec ne hiwnaya riba, i ona est obichniy ribiy korm!"); }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void eat() { System.out.println("Pingvin lubit est riby!"); }
    public void sleep() { System.out.println("Pingvini spyat prijavchis drug k drugu!"); }
    public void fly() { System.out.println("Pingvini ne umeut letat!"); }
    public void speak() { System.out.println("Pingvini ne umeut pet kak solovyi!"); }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void eat() { System.out.println("Lev, kak luboi hiwnik, lubit myaso!"); }
    public void sleep() { System.out.println("Bolshuy chast dnya lev spit!"); }
    public void run() { System.out.println("Lev eto ne samaya bystraya koshka!"); }
}

class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("mechenyi");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable pingvin = new Pingvin("pingvin");
        pingvin.speak();

        Animal4 lev = new Lev("levvv");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();

        Mammal lev2 = new Lev("levvv2");
        System.out.println(lev2.name);
        lev2.eat();;
        lev2.sleep();
        lev2.run();
        lev2.speak();

    }
}