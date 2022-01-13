package com.example.readinglist;

import javax.persistence.*;
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
    @ElementCollection(targetClass = String.class) // when using list in SpringBoot it has to be specified like this
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

    public Book() {

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
