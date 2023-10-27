package sv.duaflores.appdev.service;

import java.util.List;

import sv.duaflores.appdev.model.Books;

public interface BookService {

	public Books createBook(Books book);

	public List<Books> getAllBooks();

	public Books findBookById(Long id);

}
