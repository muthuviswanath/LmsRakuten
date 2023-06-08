package com.libman.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.libman.models.Login;
import com.libman.models.Users;
import com.libman.services.UserService;

public class UserDaoImpl  implements UserDao{

	@Autowired
	public UserService userService;

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int register(Users user) {
		String sql = "insert into users (username,password,role)values(?,?,?)";
		return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getRole()});
	}

	@Override
	public Users validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
		+ "'";
		List<Users> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}
}

class UserMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int arg1) throws SQLException {
		Users user = new Users();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setRole(rs.getString("role"));
		return user;
	}

}
