package com.libman.dao;

import java.util.List;

import com.libman.models.Books;


public interface BooksDao {
	int saveBooks(Books book);
	List<Books>getAllBooks();
	public int updateBooks(Books book) ;
	public int deleteBooks(int bookId);
	public Books getBooksById(int bookId);
}
