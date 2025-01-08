package com.example.demo.Services;

import com.example.demo.Spring.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServices {

    private List<Book> Books= new ArrayList<Book>();

    public void add(Book book) {
        Books.add(book);
    }
    public void delete(Book book) {
        Books.remove(book);
    }
}

