package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;


import com.libman.models.Lends;



public class LendRequestDaoImpl implements LendRequestDao{
	

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UsersDao userDao;

	@Override
    public List<Lends> getLentRecords() {
		return jdbcTemplate.query("SELECT * FROM lendrequest where requeststatus='Requested' ", new RowMapper<Lends>() {

			@Override
			public Lends mapRow(ResultSet rs, int rowNum) throws SQLException {
				Lends lend = new Lends();
				lend.setLendid(rs.getInt("lendid"));
				lend.setUserid(rs.getInt("userid"));
				lend.setBookid(rs.getInt("bookid"));
				return lend;
			}

		});
    }

	@Override
	public int lendRequestApproveAction(Lends lend) {
		Date currentDate = new Date();
        // Create a calendar instance and add 7 days
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        // Get the new date after adding 7 days
        Date defaultreturn_date = calendar.getTime();
		
		String returnstatus = "Approved";
		String approvequery = "Update lendrequest set requeststatus = ? , defaultreturndate = ?  where lendid = " +lend.getLendid()+"";
		return jdbcTemplate.update(approvequery,returnstatus,defaultreturn_date);
	}

	@Override
	public int lendRequestRejectAction(Lends lend) {
		Date currentDate = new Date();
		Date defaultreturn_date = null;
		Date actualreturn_date = null;
		String returnstatus = "Rejected";
		String rejectquery = "Update lendrequest set requeststatus = ? , defaultreturndate = ?, actualreturndate = ? where lendid = " +lend.getLendid()+"";
		return jdbcTemplate.update(rejectquery,returnstatus, defaultreturn_date, actualreturn_date);
	}
	@Override
	public Lends getLendRequestById(int id) {
		String fetchSingleRecord = "Select * from lendrequest where lendid=?";
		return jdbcTemplate.queryForObject(fetchSingleRecord,
																		new Object[] {id},
																		new BeanPropertyRowMapper<Lends>(Lends.class));
	}

	@Override
	public List<Lends> getApprovedLentRecords() {
		return jdbcTemplate.query("SELECT * FROM lendrequest where requeststatus='Approved' ", new RowMapper<Lends>() {

			@Override
			public Lends mapRow(ResultSet rs, int rowNum) throws SQLException {
				Lends lend = new Lends();
				lend.setLendid(rs.getInt("lendid"));
				lend.setUserid(rs.getInt("userid"));
				lend.setBookid(rs.getInt("bookid"));
				lend.setRequestdate(rs.getDate("requestdate"));
				lend.setDefaultreturndate(rs.getDate("defaultreturndate"));
				lend.setRequeststatus(rs.getString("requeststatus"));
				return lend;
			}
		});
	}

	@Override
	public List<Lends> getLentHistoryRecords() {
		return jdbcTemplate.query("SELECT * FROM lendrequest", new RowMapper<Lends>() {

			@Override
			public Lends mapRow(ResultSet rs, int rowNum) throws SQLException {
				Lends lend = new Lends();
				lend.setLendid(rs.getInt("lendid"));
				lend.setUserid(rs.getInt("userid"));
				lend.setBookid(rs.getInt("bookid"));
				lend.setRequestdate(rs.getDate("requestdate"));
				lend.setDefaultreturndate(rs.getDate("defaultreturndate"));
				lend.setActualreturndate(rs.getDate("actualreturndate"));
				lend.setFineamount(rs.getInt("fineamount"));
				lend.setRequeststatus(rs.getString("requeststatus"));
				return lend;
			}
		});
	}

	@Override
	public List<Lends> getLentRecords(int userid) {
		
		return jdbcTemplate.query("SELECT * FROM lendrequest where userid = "+userid+" and requeststatus= 'Approved' ", new RowMapper<Lends>() {

			@Override
			public Lends mapRow(ResultSet rs, int rowNum) throws SQLException {
				Lends lend = new Lends();
				lend.setLendid(rs.getInt("lendid"));
				lend.setUserid(rs.getInt("userid"));
				lend.setBookid(rs.getInt("bookid"));
				lend.setRequestdate(rs.getDate("requestdate"));
				lend.setDefaultreturndate(rs.getDate("defaultreturndate"));
				lend.setActualreturndate(rs.getDate("actualreturndate"));
				lend.setFineamount(rs.getInt("fineamount"));
				lend.setRequeststatus(rs.getString("requeststatus"));
				return lend;
			}
		});
	}
}
