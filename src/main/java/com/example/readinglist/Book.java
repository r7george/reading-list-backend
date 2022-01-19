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
    @Column(length = 1000)
    private String genres;
    @Column(length = 2000)
    private String description;


    public Book(String addedBy, String bookName, String author, String genres, String description) {
        this.addedBy = addedBy;
        this.bookName = bookName;
        this.author = author;
        this.genres = genres;
        this.description = description;
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

    public String getGenres() {
        return genres;
    }

    public String getDescription() {
        return description;
    }
}
