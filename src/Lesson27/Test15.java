package Lesson27;

public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodnernuNoguException {
        if (tempBega > 12) {
            throw new PodnernuNoguException("Temp bega byl slishkom visokim: " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probezhali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(20, 13);
        } catch (PodnernuNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("V lyubom sluchae vi poluchite gramotu!!!");
        }
    }
}

class PodnernuNoguException extends Exception {
    PodnernuNoguException() {

    }

    PodnernuNoguException(String message) {
        super(message);
    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException() {

    }

    SveloMishcuException(String message) {
        super(message);
    }
}