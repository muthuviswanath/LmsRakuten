package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.libman.models.Books;

public class BooksDaoImpl implements BooksDao{
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Books> getAllBooks() {
		return jdbcTemplate.query("SELECT * FROM books", new RowMapper<Books>() {

			@Override
			public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
				Books book= new Books();
				book.setBookId(rs.getInt("bookid"));
				book.setBooktitle(rs.getString("booktitle"));
				book.setCategory(rs.getString("category"));
				book.setNoofcopies(rs.getInt("noofcopies"));
				book.setImageurl(rs.getString("imageurl"));
				book.setAuthorid(rs.getInt("authorid"));
				book.setPublisherid(rs.getInt("publisherid"));
				return book;
			}

		});
	}

	@Override
	public int saveBooks(Books book) {
		String insertQuery = "INSERT INTO books(booktitle,noofcopies,category,imageurl,authorid,publisherid) values('"
				+book.getBooktitle()+"',"
				+book.getNoofcopies()+",'"
				+book.getCategory()+",'"
				+book.getImageurl()+",'"
				+book.getAuthorid()+",'"
				+book.getPublisherid()+"')";
		return jdbcTemplate.update(insertQuery);
	}

}
