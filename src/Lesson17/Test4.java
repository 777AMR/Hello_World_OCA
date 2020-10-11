package Lesson17;

public class Test4 {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = true;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("Hello");
        Test4 test4 = new Test4();
        System.out.println(test4.ravenstvo(sb1, sb2));
        System.out.println(test4.ravenstvo(sb1, sb3));
        System.out.println(test4.ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(test4.ravenstvo(new StringBuilder(), new StringBuilder()));
    }
}
