package pl.locon.somecool.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.locon.somecool.book.BookFacade;

@AllArgsConstructor
@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookFacade bookFacade;

    @GetMapping("count")
    public int countBooks(@RequestParam("title") String title) {
        return bookFacade.getBooksByTitle(title).size();
    }

}
