package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("poned") {
            case "poned":
            case "vtornik":
            case "sreda":
            case "4etverg":
            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskres":
                System.out.println("Raboty net");
                break;
            default:
                System.out.println("nepravilno ukazan den'");
                break;
        }
    }
}
