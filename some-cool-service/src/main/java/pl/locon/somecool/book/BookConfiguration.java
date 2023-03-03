package pl.locon.somecool.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {


    @Bean
    BookFacade bookFacade(BookRepository bookRepository) {
        return new BookFacade(bookRepository);
    }

}
