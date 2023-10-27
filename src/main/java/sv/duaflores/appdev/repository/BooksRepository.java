package sv.duaflores.appdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sv.duaflores.appdev.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

}
