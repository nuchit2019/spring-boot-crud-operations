package com.janawat.spring.boot.crud.perations;

import com.janawat.spring.boot.crud.perations.model.Books;
import com.janawat.spring.boot.crud.perations.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootCrudOperationsApplication {


    @Autowired
    private BooksRepository booksRepository;

    @PostConstruct
    public  void initailBooksData() {

        Books books =new Books();
        books.setBookid(12345);
        books.setAuthor("Janawat");
        books.setBookname("NodeJSNotesForProfessionals");
        books.setPrice(250);
        booksRepository.save(books);

        Books books1 =new Books();
        books1.setBookid(12346);
        books1.setAuthor("Janawat");
        books1.setBookname("NodeJSNotesForProfessionals");
        books1.setPrice(250);
        booksRepository.save(books1);

        Books books2 =new Books();
        books2.setBookid(12347);
        books2.setAuthor("Janawat");
        books2.setBookname("NodeJSNotesForProfessionals");
        books2.setPrice(250);
        booksRepository.save(books2);

        Books books3 =new Books();
        books3.setBookid(12348);
        books3.setAuthor("Janawat");
        books3.setBookname("NodeJSNotesForProfessionals");
        books3.setPrice(250);
        booksRepository.save(books3);

        Books books4 =new Books();
        books4.setBookid(12349);
        books4.setAuthor("Janawat");
        books4.setBookname("NodeJSNotesForProfessionals");
        books4.setPrice(250);
        booksRepository.save(books4);


    }



    public static void main(String[] args) {
        SpringApplication
				.run(SpringBootCrudOperationsApplication.class, args);
    }

}
