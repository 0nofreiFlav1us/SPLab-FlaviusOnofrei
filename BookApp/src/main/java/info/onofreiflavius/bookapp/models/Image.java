package info.onofreiflavius.bookapp;

public class Image implements Element {

    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println(url);
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
