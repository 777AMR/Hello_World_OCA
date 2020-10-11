package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.deh();
    }
}
class Animal{
    int a = 5;
    static int b = 10;
    void abc(){ System.out.println("non- static iz classa animal"); }
    void deh(){ System.out.println("static iz classa animal"); }


}
class Tiger extends Animal{
    int a = 15;
    static int b = 25;
    void abc(){ System.out.println("non- static iz classa Tiger"); }
    void deh(){ System.out.println("static iz classa Tiger"); }


}