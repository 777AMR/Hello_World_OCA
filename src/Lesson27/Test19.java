package Lesson27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
//        Animals a = new Mouse();
    }
}

class Animals {
    Animals() throws FileNotFoundException, IndexOutOfBoundsException {
    }

}

class Mouse extends Animals {
    Mouse() throws IOException, Exception, IndexOutOfBoundsException {
        super();
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception{
        if (age < 0) {
            throw new Exception("Nekorr vozrast");
        }
        this.name = name;
        this.age = age;
    }
}