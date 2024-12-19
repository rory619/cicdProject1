package ie.atu.bookservice11;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;  // Inject the repository

    public List<Book> getAllBooks() {
        return bookRepository.findAll();  // Fetch all books from the database
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);  // Find a book by its ID
    }
}
