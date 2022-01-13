package com.example.readinglist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

// this is the model
@Entity // an entity is like an instance
public class Book {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String addedBy;
    private String bookName;
    private String author;
    private List<String> genres;
    private int yearPublished;
    private String publisher;

    public Book(String addedBy, String bookName, String author, List<String> genres, int yearPublished, String publisher) {
        this.addedBy = addedBy;
        this.bookName = bookName;
        this.author = author;
        this.genres = genres;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getGenres() {
        return genres;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }
}