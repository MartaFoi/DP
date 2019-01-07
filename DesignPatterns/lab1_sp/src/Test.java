import model.*;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Carte carte = new Carte("Codul lui DaVinci");

        carte.setAutor(new Autor("Dan Brown"));

        List<SubCapitol> subCapitols = Arrays.asList(
                new SubCapitol("Sc1",Arrays.asList(new Text("Text1"), new Imagine("Img1"), new Tabel("Tabel1"))),
                new SubCapitol("Sc2",Arrays.asList(new Text("Text2"), new Imagine("Img2"), new Tabel("Tabel2"))),
                new SubCapitol("Sc3",Arrays.asList(new Text("Text3"), new Imagine("Img3"), new Tabel("Tabel3")))
        );

        List<Capitol> capitolList = Arrays.asList(
                new Capitol("Cap1", subCapitols),
                new Capitol("Cap1", subCapitols)
        );


        carte.setCapitol(capitolList);

        System.out.println(carte);
    }
}
