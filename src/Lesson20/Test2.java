package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add( "ok");
        list.add( "hello");
        list.add( "hi");
        list.add( "poka");
        list.add( "snow");
        list.add( "rain");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add( "petrov");
        list1.add( "sidorov");
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println(list.size());

        list.remove("poka");

        list.addAll(1, list1);
        System.out.println(list.size());
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
