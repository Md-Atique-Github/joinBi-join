package bidirectional.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//import jakarta.persistence.Id;
@Component
public interface IBookRepository extends JpaRepository<Book,Integer>{
    
}
