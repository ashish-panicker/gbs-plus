package com.gbsplus.controller;

import com.gbsplus.service.BookService;

public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook() {
        System.out.println("Enter title: ");
        String title = System.console().readLine();
        System.out.println("Enter author: ");
        String author = System.console().readLine();
        System.out.println("Enter description: ");
        String description = System.console().readLine();
        bookService.addBook(title, author, description);
    }

    public void findByTitle() {
        System.out.println("Enter title: ");
        String title = System.console().readLine();
        bookService.findByTitle(title);
    }

    public void findByAuthor() {

        System.out.println("Enter author: ");
        String author = System.console().readLine();
        bookService.findByAuthor(author);
    }

    public void print() {
        bookService.print();
    }

}
