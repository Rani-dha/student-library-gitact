package com.example.studentlibrary.repositories;


import com.example.studentlibrary.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
