package com.janawat.spring.boot.crud.perations.controller;

import com.janawat.spring.boot.crud.perations.model.Books;
import com.janawat.spring.boot.crud.perations.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

// mark class as Controller
@RestController
public class BookController {

    //autowired the BookeService class
    @Autowired
    BookService  bookService;

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/book")
    private List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private  Books getBookById(@PathVariable int id){
        return   bookService.getBooksById(id);
    }



    //creating a delete mapping that delete as specified book
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid){
        bookService.delete(bookid);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books)
    {
        bookService.saveOrUpdate(books);
        return books.getBookid();
    }

    //creating put mapping that update the book detail
    @PutMapping("/books")
    private Books update(@RequestBody Books books)
    {
        bookService.saveOrUpdate(books);
        return books;
    }


}
