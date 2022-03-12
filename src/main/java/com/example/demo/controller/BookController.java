package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
// @Api(value="Book Service", description="My Book Store")		// It will replace Book Controller to My Book Store in UI
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/save")
//	@ApiOperation(value="Store Book API")			// Can be write in expand operations in UI for more meaning full for display
	public String saveBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/searchBook/{bookId}")
//	@ApiOperation(value="Search Book API")			// Can be write in expand operations in UI for more meaning full for display
	public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);
	}
	
	@DeleteMapping("deleteBook/{bookId}")
//	@ApiOperation(value="Delete Book API")			// Can be write in expand operations in UI for more meaning full for display
	public List<Book> deleteBook(@PathVariable int bookId){
		return service.removeBook(bookId);
	}

}
