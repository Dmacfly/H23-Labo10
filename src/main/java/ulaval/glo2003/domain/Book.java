package ulaval.glo2003.domain;

public class Book {
    private final String title;
    private final int nbPages;
    private final String author;

    public Book(String title, int nbPages, String author) {
        this.title = title;
        this.nbPages = nbPages;
        this.author = author;
    }
}
