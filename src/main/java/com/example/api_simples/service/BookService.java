package com.example.api_simples.service;


import com.example.api_simples.model.BookModel;
import com.example.api_simples.repository.BookRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class BookService {

    private final BookRepository bookRepository;


    public List<BookModel> getAll() {
        return this.bookRepository.findAll();
    }

    public BookModel postBook(BookModel bookModel) {
        return this.bookRepository.save(bookModel);
    }
}
