package com.janawat.spring.boot.crud.perations.service;

import com.janawat.spring.boot.crud.perations.model.Books;
import com.janawat.spring.boot.crud.perations.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class BookService {

    @Autowired
    BooksRepository booksRepository;

    //getting all books record by using the method findAll() of CrudRepository
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }


    //getting as specific record by using the method findById() of CrudRepository
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    //saving as specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }


    //delete as specific record by using the method deleteById of CrudRepository
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    //updating a record
    public void update (Books books,int id)
    {
        booksRepository.save(books);
    }
}
