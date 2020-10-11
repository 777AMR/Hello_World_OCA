package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        //int[] array = {0, 6, 4, 1};
        String[] array = {"privet", "poka", "ok"};
        for (String s : array) {
            s = new String("hello");
            // a = 3;//Меняется значение ПЕРЕМЕННОЙ, а не самого значения (прим типы)
        }
        /*for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
