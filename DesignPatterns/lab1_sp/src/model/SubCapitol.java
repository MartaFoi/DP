package model;

import java.util.List;

public class SubCapitol {

    private String titlu;
    private List<Element> elementList;

    public SubCapitol(String titlu) {
        this.titlu = titlu;
    }

    public SubCapitol(String titlu, List<Element> elementList) {
        this.titlu = titlu;
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "SubCapitol{" +
                "titlu='" + titlu + '\'' +
                ", elementList=" + elementList +
                '}';
    }
}
