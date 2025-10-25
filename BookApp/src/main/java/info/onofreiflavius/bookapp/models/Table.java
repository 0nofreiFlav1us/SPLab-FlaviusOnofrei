package info.onofreiflavius.bookapp;

public class Table implements Element {

    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int id) {
        return null;
    }

}
