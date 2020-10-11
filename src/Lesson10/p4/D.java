package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;

import static Lesson10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        C c = new C();
        System.out.println(c.c);
        E e = new E();
        System.out.println(e.e);
        System.out.println(b);
        System.out.println(bb);
    }
}
