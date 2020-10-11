package Lesson26;

public class Test7 {
    public static void main(String[] args) {
        Lion a = new Lion();
    }

}
class Animal{
    Animal(){ System.out.println("constr of animal"); }
    static { System.out.println("static init of animal"); }
    { System.out.println("non-static init of animal"); }
}
class Mammal extends Animal{
    Mammal(){ System.out.println("constr of Mammal"); }
    static { System.out.println("static init of Mammal"); }
    { System.out.println("non-static init of Mammal"); }
}
class Lion extends Mammal{
    Lion(){ System.out.println("constr of Lion"); }
    static { System.out.println("static init of Lion"); }
    { System.out.println("non-static init of Lion"); }
}