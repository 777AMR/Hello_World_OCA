package Lesson27;

import java.io.*;

public class Test11 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test 9 ne naiden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test 10 ne naiden");
        } finally {
            System.out.println("Eto vnewniy finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Naideno iskluchenie v finally bloke");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}

