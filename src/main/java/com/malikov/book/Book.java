package com.malikov.book;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private int year;


    public Book
    (
        int isbn, 
        String title, 
        String author, 
        int year
    )
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public int getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }


    @Override
    public String toString()
    {
        return "Book info:\n\tTitle: " + title + "\n\tAuthor: " + author + "\n\tYear: " + year + "\n\tISBN: " + isbn;
    }
}
