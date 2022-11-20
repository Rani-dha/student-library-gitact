package com.example.studentlibrary.services;

import com.example.studentlibrary.models.Author;
import com.example.studentlibrary.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void create(Author author) {
        authorRepository.save(author);
    }
}
