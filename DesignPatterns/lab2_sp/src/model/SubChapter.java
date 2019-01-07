package model;

public class SubChapter {

    private String name;

    public SubChapter() {
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("SubChapter{" +
                "title='" + name + '\'' +
                '}');
    }
}
