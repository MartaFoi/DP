package model;

public class Autor {
    private String nume;

    public Autor(String autor) {
        this.nume = autor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
