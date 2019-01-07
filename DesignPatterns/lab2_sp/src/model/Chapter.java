package model;

public class Chapter {

    private String name;

    public Chapter() {
    }

    public Chapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Chapter{" +
                "title='" + name + '\'' +
                '}');
    }
}
