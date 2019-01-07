package model;

public class Imagine implements Element {

    String numeImagine;

    public Imagine(String numeImagine) {
        this.numeImagine = numeImagine;
    }

    /*@Override
    public void print() {
        System.out.print("numeImagine = " + numeImagine);
    }*/

    @Override
    public String toString() {
        return "numeImagine= " + numeImagine;
    }
}
