package sv.duaflores.appdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sv.duaflores.appdev.model.Books;
import sv.duaflores.appdev.service.AuthorsService;
import sv.duaflores.appdev.service.BookService;
import sv.duaflores.appdev.service.CategoriesService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@Autowired
	private AuthorsService authorService;

	@Autowired
	private CategoriesService categoryService;

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/books")
	public String getAllBooks(Model model) {
		try {
			model.addAttribute("books", bookService.getAllBooks());
		} catch (Exception e) {

		}
		return "books";
	}

	@RequestMapping(value = { "/create" }, method = RequestMethod.GET)
	public String selectOptionExample1Page(Model model) {
		Books bookForm = new Books();
		model.addAttribute("bookForm", bookForm);
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("categories", categoryService.getAllCategories());
		return "create";
	}

	@PostMapping("/save")
	public String saveBook(@ModelAttribute("bookForm") Books book) {
		bookService.createBook(book);
		return "redirect:/books";
	}

	@GetMapping("/edit/{id}")
	public String saveBook(@PathVariable(value = "id") long id, Model model) {
		Books book = bookService.findBookById(id);
		model.addAttribute("bookForm", book);
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("categories", categoryService.getAllCategories());
		return "edit";
	}
}
