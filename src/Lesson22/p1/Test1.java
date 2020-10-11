package Lesson22.p1;

import Lesson22.Chelovek;

public class Test1 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("male");
        chelovek.setName(new StringBuilder("Kolya"));
        chelovek.setVes(50);
        chelovek.setVozrast(15);
        System.out.println(chelovek.getName());
        System.out.println(chelovek.getVozrast());
        System.out.println(chelovek.getVes());
    }
}
