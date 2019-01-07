package model;

import java.util.List;

public class Capitol {

    private String titlu;
    private List<SubCapitol> subCapitol;

    public Capitol(String titlu) {
        this.titlu = titlu;
    }

    public Capitol(String titlu, List<SubCapitol> subCapitol) {
        this.titlu = titlu;
        this.subCapitol = subCapitol;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public List<SubCapitol> getSubCapitol() {
        return subCapitol;
    }

    public void setSubCapitol(List<SubCapitol> subCapitol) {
        this.subCapitol = subCapitol;
    }

    @Override
    public String toString() {
        return "\n\tCapitol{" +
                "titlu='" + titlu + '\'' +
                ", subCapitol=" + subCapitol +
                '}';
    }
}
