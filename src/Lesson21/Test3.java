package Lesson21;

public class Test3 {
    Test3() {
        System.out.println("constructor");
    }

    void Test3() {
        System.out.println("metod");
    }
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.Test3();

    }
}