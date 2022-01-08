package com.gbsplus.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.gbsplus.model.Book;

public class BookService {

    private List<Book> books = new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }

    private void addBook(Book book) {
        books.add(book);
    }

    public void addBook(String title, String author, String description) {
        Book book = new Book(title, author, description);
        addBook(book);
    }

    public void findByTitle(String title) {
        books.stream().filter(b -> b.getTitle().equals(title)).findAny().ifPresentOrElse(
                book -> System.out.println(book), () -> System.out.println("No book found"));
    }

    public void findByAuthor(String author) {
        books.stream().filter(b -> b.getAuthor().equals(author)).findAny().ifPresentOrElse(
                book -> System.out.println(book), () -> System.out.println("No book found"));
    }

    public void print() {


        books.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .forEach(b -> System.out.println(b));
    }

}
