package Homework.Lesson6;

public class Summirovanie {

    int sum() {
        int result = 0;
        System.out.println("Summa vseh chisel: " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Summa vseh chisel: " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Summa vseh chisel: " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Summa vseh chisel: " + result3);
        return result3;
    }

    int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Summa vseh chisel: " + result4);
        return result4;
    }

    static class SummirovanieTest {
        public static void main(String[] args) {
            Summirovanie s = new Summirovanie();
            s.sum();
            s.sum(3);
            s.sum(3, 5);
            s.sum(3, 5, 7);
            s.sum(3, 5, 7, 11);
        }
    }

}
