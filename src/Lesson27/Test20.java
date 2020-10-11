package Lesson27;

public class Test20 {
    static void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
