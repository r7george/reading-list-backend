package com.example.readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadingListController {

    @Autowired
    ReadingListRepository repository;

    @GetMapping("/reading-list")
    public List<Book> getReadingList() {
        return repository.findAll();
    }

    @PostMapping("/reading-list/add")
    public String addToReadingList(@RequestBody Book book) {
        repository.save(book);
        return "Book added: " + book.getBookName();
    }

}
