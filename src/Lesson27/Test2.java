package Lesson27;

public class Test2 {
    void abc() {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Iscl: " + i);
        }

    }
}
