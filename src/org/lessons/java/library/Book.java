package org.lessons.java.library;

public class Book {
    //ATTRIBUTES
    private String title;
    private int numPages;
    private String author;
    private String editor;

    //CONSTRUCTOR

    public Book(String title, int numPages, String author, String editor) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Va inserito un titolo!");
        }
        this.title = title;

        if (numPages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine non può essere negativo!");
        }
        this.numPages = numPages;

        if (author.isBlank()) {
            throw new IllegalArgumentException("Va inserito un autore!");
        }
        this.author = author;

        if (editor.isBlank()) {
            throw new IllegalArgumentException("Va inserita una casa editrice!");
        }
        this.editor = editor;

    }

    //GETTER
    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    //SETTER
    public void setTitle(String title) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Va inserito un titolo!");
        }
        this.title = title;
    }

    public void setNumPages(int numPages) {
        if (numPages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine non può essere negativo!");
        }
        this.numPages = numPages;
    }

    public void setAuthor(String author) {
        if (author.isBlank()) {
            throw new IllegalArgumentException("Va inserito un autore!");
        }
        this.author = author;
    }

    public void setEditor(String editor) {
        if (editor.isBlank()) {
            throw new IllegalArgumentException("Va inserita una casa editrice!");
        }
        this.editor = editor;
    }


    public String toString(){
        return "Titolo: " + title +
                "\nNumero pagine: " + numPages +
                "\nAutore: " + author +
                "\nCasa editrice: " + editor;
    }
}
