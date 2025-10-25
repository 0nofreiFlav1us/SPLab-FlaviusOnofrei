package info.onofreiflavius.bookapp;

import java.util.ArrayList;

public class SubChapter {

    private String name;
    private ArrayList<Element> elements;

    public SubChapter(String name, ArrayList<Element> elements) {
        this.name = name;
        this.elements = elements;
    }

    public void print() {
        System.out.println("SubChapter: " + name);
    }

}
