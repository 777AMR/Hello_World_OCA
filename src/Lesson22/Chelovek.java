package Lesson22;

public class Chelovek {
    final String pol;
    private StringBuilder name;
    private int vozrast;
    private int ves;
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }

    public Chelovek(String pol) {
        this.pol = pol;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        this.name = s;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            this.vozrast = i;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            this.ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("male");
        chelovek.setName(new StringBuilder("Kolya"));
        chelovek.getName().append("!!!!");
        System.out.println(chelovek.getName());
    }
}
