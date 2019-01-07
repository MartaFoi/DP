package model;

import java.util.List;

public class Carte {
    private String titlu;
    private Autor autor;
    private List<Element> capitol;

    public Carte(String titlu, Autor autor, List<Element> capitol) {
        this.titlu = titlu;
        this.autor = autor;
        this.capitol = capitol;
    }


}
