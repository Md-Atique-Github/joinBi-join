package bidirectional.join;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private IBookRepository iBookRepository;

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){

        iBookRepository.save(book);

    }

    @GetMapping("/get")
    public List<Book> getBook(){
        List<Book> books = iBookRepository.findAll();
        return books;
    }
    
}
