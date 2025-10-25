package info.onofreiflavius.bookapp;

import java.util.ArrayList;

public class Section implements Element {

    private final String title;
    private final ArrayList<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int id) {
        return elements.get(id);
    }
}
