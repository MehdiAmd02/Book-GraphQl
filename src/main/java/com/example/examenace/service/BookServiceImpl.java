package com.example.examenace.service;

import com.example.examenace.dao.entities.Book;
import com.example.examenace.dao.repositories.BookRepository;
import com.example.examenace.dto.BookDTO;
import com.example.examenace.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private  BookRepository bookRepository;
    @Autowired

    private  BookMapper bookMapper;
    private final List<BookDTO> books = new ArrayList<>();


    @Override
    public List<BookDTO> findBooksByTitle(String title) {
        List<Book> books = bookRepository.findByTitreContainingIgnoreCase(title);
        List<BookDTO> bookDTOs = new ArrayList<>();
        for (Book book : books) {
            bookDTOs.add(bookMapper.toDTO(book));
        }
        return bookDTOs;
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        books.add(bookDTO);
        return bookDTO;
    }


}