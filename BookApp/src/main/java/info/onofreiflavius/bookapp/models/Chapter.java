package info.onofreiflavius.bookapp;

import java.util.ArrayList;

public class Chapter {

    private String name;
    private ArrayList<SubChapter> subChapters;

    public Chapter(String name, ArrayList<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public void print() {
        System.out.println(name);
    }

}
