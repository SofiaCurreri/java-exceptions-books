package org.lessons.java.library;

public class Book {
    //ATTRIBUTES
    private String title;
    private int numPages;
    private String author;
    private String editor;

    //CONSTRUCTOR

    public Book(String title, int numPages, String author, String editor) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
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
        this.title = title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String toString(){
        return "Titolo: " + title +
                "\nNumero pagine: " + numPages +
                "\nAutore: " + author +
                "\nCasa editrice: " + editor;
    }
}
