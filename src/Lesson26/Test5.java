package Lesson26;

public class Test5 {
    {
        System.out.println("eto init blok3");
    }

    Test5(){
        System.out.println("eto konstructor1");
    }

    Test5(int a){
        this();
        System.out.println("eto konstructor2");
    }

    static {
        System.out.println("eto init blok static 1");
    }

    {
        System.out.println("eto init blok1");
    }

    {
        System.out.println("eto init blok2");
    }
    static {
        System.out.println("eto init blok static 2");
    }


    public static void main(String[] args) {
    Test5 t1 = new Test5();
    Test5 t2 = new Test5(3);

    }
}
