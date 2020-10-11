package Lesson27;

public class Test16 {
    static Doctor[] array = new Doctor[4];

    public static void main(String[] args) {
//         ArrayList<String> list;
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));
//        System.out.println(5/0);
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher[] array2 = {t, t3};
//        Employee[] array1 = {d, t};
//        Doctor d2 = (Doctor) array2[0];
//        Teacher t2 = (Teacher) array1[0];
//        createPwd("qwer");
//        list.add("!!!");
//        System.out.println(array[0].toString());
        Integer.parseInt("44ab", 16);
    }

    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Dlina parolya sliwkom malen'kaya");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Dlina parolya sliwkom bol'shaya");
        }
        System.out.println("Parol' prinyat");
    }
}

class Employee {
}

class Doctor extends Employee {
}

class Teacher extends Employee {
}

//class Samolet {
//    String sostoyanie = "v ojidanii"; // v vozduhe, polet otmenen
//
//    public void letet() {
//        sostoyanie = "v vozduhe";
//        System.out.println("samolet letit");
//    }
//
//    public void ojidat() {
//        if (sostoyanie.equals("v vozduhe")) {
//            throw new IllegalStateException("Samolet uzhe v vozduhe");
//        }
//        sostoyanie = "v ojidanii";
//        System.out.println("samolet v ojidanii poleta");
//    }
//
//    public void otmenitPolet() {
//        if (sostoyanie.equals("v vozduhe")) {
//            throw new IllegalStateException("Samolet uzhe v vozduhe");
//        }
//        sostoyanie = "polet otmenen";
//        System.out.println("Polet samoleta otmenen");
//    }
//
//    public static void main(String[] args) {
//        Samolet t = new Samolet();
//        t.ojidat();
//        t.letet();
//        t.otmenitPolet();
//    }
//}