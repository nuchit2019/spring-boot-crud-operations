package com.janawat.spring.boot.crud.perations.repository;

import com.janawat.spring.boot.crud.perations.model.Books;
import org.springframework.data.repository.CrudRepository;

// repositry tha extends CrudRepository
public interface BooksRepository
        extends CrudRepository<Books,Integer> {
}
