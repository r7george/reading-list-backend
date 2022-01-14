package com.example.readinglist;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/reading-list/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findBookByid(Integer.parseInt(id)));
    }

    @DeleteMapping("/reading-list/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable String id) {
        repository.deleteBookByid(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("Book with ID: " + id + "has been deleted");
    }

}
