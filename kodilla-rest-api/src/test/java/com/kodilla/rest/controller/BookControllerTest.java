package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);

    @Test
    void shouldFetchBooks() {
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        bookController.addBook(new BookDto("The Lord Of The Rings", "J.R.R. Tolkien"));
        bookController.addBook(new BookDto("Bastion", "Stephen King"));
        bookController.addBook(new BookDto("It", "Stephen King"));

        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("It", "Stephen King"));
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("Bastion", "Stephen King"));
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("The Lord Of The Rings", "J.R.R. Tolkien"));
    }
}