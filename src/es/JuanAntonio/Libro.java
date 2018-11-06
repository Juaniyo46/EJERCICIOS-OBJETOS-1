package es.JuanAntonio;

public class Libro {
    private long isbn;
    private String title;
    private String author;
    private int numPag;

    public Libro(long isbn, String title, String author, int numPag) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numPag = numPag;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "El libro " + title + " con ISBN " + isbn + " creado por " + author + " tiene " + numPag + " páginas ";
        /*"Libro{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPag=" + numPag +
                '}';*/
    }


}
