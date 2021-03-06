package com.example.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingListRepository extends JpaRepository<Book, String> {
    Book findBookByid(int id);
    String deleteBookByid(int id);
}
