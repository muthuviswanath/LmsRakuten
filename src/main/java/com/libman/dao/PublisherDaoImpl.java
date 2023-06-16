package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.libman.models.Authors;
import com.libman.models.Publishers;

public class PublisherDaoImpl implements PublisherDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PublisherDao publisherDao;
	
	@Override
    public List<Publishers> getPublishersRecords() {
		return jdbcTemplate.query("SELECT * FROM publishers ", new RowMapper<Publishers>() {

			@Override
			public Publishers mapRow(ResultSet rs, int rowNum) throws SQLException {
				Publishers publisher = new Publishers();
				publisher.setPublisherid(rs.getInt("publisherid"));
				publisher.setPublishername(rs.getString("publishername"));
				return publisher;
			}

		});
    }
	
	@Override
	public int savePublishers(Publishers publisher) {
		String insertQuery = "INSERT INTO publishers(publishername) values('"
				+publisher.getPublishername()+"')";
		return jdbcTemplate.update(insertQuery);
	}

	@Override
	public int updatePublishers(Publishers publisher) {
		String updateQuery = "Update publishers set publishername= '"+publisher.getPublishername()+"'";
		return jdbcTemplate.update(updateQuery);

	}

	@Override
	public int deletePublishers(int publisherid) {
		String deleteQuery = "DELETE FROM publishers WHERE publisherid = ?";
		return jdbcTemplate.update(deleteQuery, publisherid);
	}

	@Override
	public Publishers getPublishersById(int publisherid) {
		String getPublisherByIdQuery = "SELECT * FROM publishers WHERE publisherid = ?";
		return jdbcTemplate.queryForObject(getPublisherByIdQuery, new Object[] {publisherid}, new RowMapper<Publishers>() {

			@Override
			public Publishers mapRow(ResultSet rs, int rowNum) throws SQLException {
				Publishers publisher = new Publishers();
				publisher.setPublisherid(rs.getInt("publisherid"));
				publisher.setPublishername(rs.getString("publishername"));
				
				return publisher;
			}
			
		});
	}

}
