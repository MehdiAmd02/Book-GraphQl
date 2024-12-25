package com.example.examenace.dao.repositories;

import com.example.examenace.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitreContainingIgnoreCase(String titre);
}
