package webmvc.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tuananh on 06/12/17.
 */
@Controller
public class BookController {
    @RequestMapping(value = "/showBook")
    public String showBook(Model model) {
        Book book = new Book();
        model.addAttribute("bookData", book);
        return "demo2/book";
    }

    // action : /updateBook, method = GET
    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute(value = "bookData")Book book) {
        return "demo2/bookResult";
    }
}
