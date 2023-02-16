package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(@RequestBody BookDto bookDto) {
        System.out.println(bookDto.getAuthor());
        books.add(bookDto);
    }

    public void removeBook(BookDto bookDto) {
        books.remove(bookDto);
    }
}