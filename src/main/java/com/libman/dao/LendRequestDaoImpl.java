package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;


import com.libman.models.Lends;


public class LendRequestDaoImpl implements LendRequestDao{
	

	@Autowired
	public JdbcTemplate jdbcTemplate;

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
		LocalDate current_date = LocalDate.now();
		LocalDate defaultreturn_date = current_date.plusDays(7);
		String retdate = defaultreturn_date.toString();
		String returnstatus = "Approved";
		String approvequery = "Update lendrequest set requeststatus = ? , defaultreturndate = ?  where lendid = " +lend.getLendid()+"";
		return jdbcTemplate.update(approvequery,returnstatus,retdate);
	}

	@Override
	public int lendRequestRejectAction(Lends lend) {
		LocalDate current_date = LocalDate.now();
		LocalDate defaultreturn_date = null;
		LocalDate actualreturn_date = null;
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
    
}