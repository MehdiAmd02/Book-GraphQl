package com.example.examenace.mapper;


import com.example.examenace.dao.entities.Book;
import com.example.examenace.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    ModelMapper mapper = new ModelMapper();
    public BookDTO toDTO(Book book) {

        return mapper.map(book, BookDTO.class);
    }


}
