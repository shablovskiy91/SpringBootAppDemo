package com.greatbit;

import java.util.Arrays;

import com.greatbit.models.Book;
import com.greatbit.models.BookStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BookStorage.getBooks().add(
                new Book("Учение Дона Хуана", "Карлос Кастанеда", 400)
        );
        BookStorage.getBooks().add(
                new Book("Богатый Папа, Бедный Папа", "Роберт Киосаки", 300)
        );

        SpringApplication.run(Application.class, args);
    }
}