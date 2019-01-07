package model;

public class Text implements Element{

    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "text= " + text;
    }
}
