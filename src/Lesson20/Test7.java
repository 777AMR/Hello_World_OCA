package Lesson20;

import java.util.ArrayList;

import java.util.Collections;

public class Test7 {
    public ArrayList<String> abc(String... strings) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String a : strings) {
            if (!arrayList.contains(a)) {
                arrayList.add(a);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        test7.abc("privet", "poka", "ok", "privet", "kak dela", "hello", "poka");

    }
}
