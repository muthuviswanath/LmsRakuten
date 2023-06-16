package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.libman.models.Authors;
import com.libman.models.Books;

public class AuthorDaoImpl implements AuthorDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AuthorDao authorDao;

	@Override
    public List<Authors> getAuthorRecords() {
		return jdbcTemplate.query("SELECT * FROM authors ", new RowMapper<Authors>() {

			@Override
			public Authors mapRow(ResultSet rs, int rowNum) throws SQLException {
				Authors author = new Authors();
				author.setAuthorid(rs.getInt("authorid"));
				author.setAuthorname(rs.getString("authorname"));
				return author;
			}

		});
    }
	
	@Override
	public int saveAuthors(Authors author) {
		String insertQuery = "INSERT INTO authors(authorname) values('"
				+author.getAuthorname()+"')";
		return jdbcTemplate.update(insertQuery);
	}

	@Override
	public int updateAuthors(Authors author) {
		String updateQuery = "Update authors set authorname= '"+author.getAuthorname()+"'";
		return jdbcTemplate.update(updateQuery);

	}

	@Override
	public int deleteAuthors(int authorId) {
		String deleteQuery = "DELETE FROM authors WHERE authorid = ?";
		return jdbcTemplate.update(deleteQuery, authorId);
	}

	@Override
	public Authors getAuthorById(int authorId) {
		String getAuthorByIdQuery = "SELECT * FROM authors WHERE authorid = ?";
		return jdbcTemplate.queryForObject(getAuthorByIdQuery, new Object[] {authorId}, new RowMapper<Authors>() {

			@Override
			public Authors mapRow(ResultSet rs, int rowNum) throws SQLException {
				Authors author = new Authors();
				author.setAuthorid(rs.getInt("authorid"));
				author.setAuthorname(rs.getString("authorname"));
				
				return author;
			}
			
		});
	}

}
