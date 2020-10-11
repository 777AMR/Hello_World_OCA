package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        StringBuilder st1 = new StringBuilder("Hello world");

        st1.insert(2, array, 1, 3);
        System.out.println(st1);
        //st1.append(array, 2, 3);
        //System.out.println(st1);

        //String s = new String(array);
        //System.out.println(s);
    }
}
