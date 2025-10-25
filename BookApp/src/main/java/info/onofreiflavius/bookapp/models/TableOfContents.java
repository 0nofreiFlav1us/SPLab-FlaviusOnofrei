package info.onofreiflavius.bookapp;

public class TableOfContents implements Element {

    private String content;

    public TableOfContents(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
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
