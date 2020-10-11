package Lesson22;

public class Animal {

    public int eyes;

    public Animal() {
        System.out.println("I'm animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    public Dog(String name) {
        this.name = name;
        System.out.println("I'm dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dogs plays");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        this.name = name;
        System.out.println("I'm cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cats sleeps");
    }
}
class Test44{
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println("Kol-vo lap u sobaki: " + dog.paw);
        Cat cat = new Cat("Kot");
        cat.sleep();
    }
}