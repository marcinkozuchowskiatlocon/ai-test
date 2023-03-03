package pl.locon.somecool.book;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BookFacade {

    private final BookRepository bookRepository;

    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
