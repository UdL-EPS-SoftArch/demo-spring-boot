package cat.udl.eps.entsoftarch.demospringboot.persistence.repo;


import cat.udl.eps.entsoftarch.demospringboot.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
