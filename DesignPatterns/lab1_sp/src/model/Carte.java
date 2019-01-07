package model;

import java.util.List;

public class Carte {
    private String titlu;
    private Autor autor;
    private List<Capitol> capitol;

    public Carte(String titlu) {
        this.titlu = titlu;
    }

    public Carte(String titlu, Autor autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public Carte(String titlu, Autor autor, List<Capitol> capitol) {
        this.titlu = titlu;
        this.autor = autor;
        this.capitol = capitol;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Capitol> getCapitol() {
        return capitol;
    }

    public void setCapitol(List<Capitol> capitol) {
        this.capitol = capitol;
    }

    @Override
    public String toString() {
        return "Carte{\n" +
                "titlu='" + titlu + '\'' +
                "\nautor=" + autor +
                "\ncapitol=" + capitol +
                '}';
    }
}
