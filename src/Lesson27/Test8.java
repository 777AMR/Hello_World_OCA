package Lesson27;

import java.io.*;

public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
//            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            System.out.println("perem a v catch = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("finally");
            System.out.println("perem a v finally = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
