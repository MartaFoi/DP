package model;

public class Book {

    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book{" +
                "title='" + title + '\'' +
                '}');
    }
}
