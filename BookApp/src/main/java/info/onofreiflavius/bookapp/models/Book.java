package info.onofreiflavius.bookapp;

import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Element> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        elements.add(element);
    }

}
