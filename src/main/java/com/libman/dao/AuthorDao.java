package com.libman.dao;

import java.util.List;

import com.libman.models.Authors;



public interface AuthorDao {
	int saveAuthors(Authors author);
	List<Authors>getAuthorRecords();
	public int updateAuthors(Authors author) ;
	public int deleteAuthors(int authorId);
	public Authors getAuthorById(int authorId);
}
