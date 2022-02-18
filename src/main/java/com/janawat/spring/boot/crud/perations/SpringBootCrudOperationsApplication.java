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

        Books books =new Books(1111, "Janawat", "NodeJSNotesForProfessionals",250);
        booksRepository.save(books);

        Books books2 =new Books(2222, "Janawat6", "NodeJSNotesForProfessionals6",260);
        booksRepository.save(books2);

        Books books3 =new Books(3333, "Janawat7", "NodeJSNotesForProfessionals7",270);
        booksRepository.save(books3);

        Books books4 =new Books(4444, "Janawat8", "NodeJSNotesForProfessionals8",280);
        booksRepository.save(books4);


    }



    public static void main(String[] args) {
        SpringApplication
				.run(SpringBootCrudOperationsApplication.class, args);
    }

}
