package model;

public class Tabel implements Element {

    public String numeTabel;

    public Tabel(String numeTabel) {
        this.numeTabel = numeTabel;
    }

    @Override
    public String toString() {
        return "numeTabel= " + numeTabel;
    }
}
