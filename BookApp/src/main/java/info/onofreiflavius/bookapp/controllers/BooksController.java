package info.onofreiflavius.bookapp;

import info.onofreiflavius.bookapp.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BooksController {

    @GetMapping("/books")
    ArrayList<Book> getAllBooks() { return null; }

    @GetMapping("/books/{id}")
    Book getBook(@PathVariable int id) { return null; }

    @PostMapping("/books")
    void createBook() {}

    @PutMapping("/books/{id}")
    void updateBook(@PathVariable int id) {}

    @DeleteMapping("/book/id")
    void deleteBook(@PathVariable int id) {}

}
