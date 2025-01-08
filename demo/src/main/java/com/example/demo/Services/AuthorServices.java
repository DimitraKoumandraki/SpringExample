package com.example.demo.Services;

import com.example.demo.Spring.Author;
import java.util.ArrayList;
import java.util.List;


public class AuthorServices {

    private List<Author>Authors= new ArrayList<Author>();

    public void add(Author author) {
        Authors.add(author);
    }
    public void delete(Author author) {
        Authors.remove(author);
    }
}
