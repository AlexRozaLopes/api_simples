package com.example.api_simples.controller;

import com.example.api_simples.model.BookModel;
import com.example.api_simples.service.BookService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@Data
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<BookModel> getAllBooks(){
        return this.bookService.getAll();
    }

    @PostMapping
    public BookModel postBook(@RequestBody BookModel bookModel){
        return this.bookService.postBook(bookModel);
    }
}


