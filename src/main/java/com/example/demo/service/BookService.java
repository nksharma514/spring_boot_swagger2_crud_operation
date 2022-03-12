package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	
	
	public String addBook(Book book) {
		repository.save(book);
		return " Book Added with id "+book.getBookId();
	}
	
	public Book getBook(int bookId) {
		return repository.findById(bookId).orElse(null);
	}
	
	public List<Book> removeBook(int bookId){
		repository.deleteById(bookId);
		return repository.findAll();
	}

}
