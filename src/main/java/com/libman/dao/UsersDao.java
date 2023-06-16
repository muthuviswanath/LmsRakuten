package com.libman.dao;

import java.util.List;

import com.libman.models.Authors;
import com.libman.models.Login;
import com.libman.models.Users;

public interface UsersDao {
	 	int register(Users user);
	    Users validateUser(Login login);
		List<Users>getUserRecords();
		public int updateUsers(Users user) ;
		public int deleteUsers(int userId);
		public Users getUserById(int userId);
}
