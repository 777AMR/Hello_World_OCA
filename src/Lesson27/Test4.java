package Lesson27;

import java.io.*;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("test10.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        try {
            t.def();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            IOException f = e;
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
