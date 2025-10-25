package info.onofreiflavius.bookapp;

public class Paragraph implements Element {

    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int id) {
        return null;
    }

    public void getSetAlignStrategy() {
        textAlignment.print();
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

}
