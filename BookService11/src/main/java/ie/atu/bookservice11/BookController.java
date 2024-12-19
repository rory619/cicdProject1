package ie.atu.bookservice11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("1", "The Hobbit", "J.R.R Tolkien", 12.99),
                    new Book("1", "The Hobbit", "J.R.R Tolkien", 12.99)
            )
    );
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }
}
