package sv.duaflores.appdev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.duaflores.appdev.model.Books;
import sv.duaflores.appdev.repository.BooksRepository;
import sv.duaflores.appdev.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BooksRepository bkRp;

	@Override
	public Books createBook(Books book) {
		return bkRp.save(book);
	}

	@Override
	public List<Books> getAllBooks() {
		return bkRp.findAll();
	}

	@Override
	public Books findBookById(Long id) {
		Optional<Books> optional = bkRp.findById(id);
		Books book = null;
		if (optional.isPresent()) {
			book = optional.get();
		} else {
			throw new RuntimeException(" not found for id : " + id);
		}
		return book;
	}

}
