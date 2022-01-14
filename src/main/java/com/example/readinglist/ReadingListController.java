package com.example.readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReadingListController {
    @Autowired
    ReadingListRepository repository;

    @GetMapping("/reading-list")
    public ResponseEntity<List<Book>> getReadingList() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping("/reading-list/add")
    @Transactional
    public ResponseEntity<String> addToReadingList(@RequestBody Book book) {
        repository.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body("Book added: " + book.getBookName());
    }

}
