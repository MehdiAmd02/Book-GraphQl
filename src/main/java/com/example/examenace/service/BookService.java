package com.example.examenace.service;

import com.example.examenace.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> findBooksByTitle(String title);
    BookDTO saveBook(BookDTO bookDTO);
}