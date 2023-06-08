package com.libman.dao;

import com.libman.models.Login;
import com.libman.models.Users;

public interface UserDao {
	 int register(Users user);
	    Users validateUser(Login login);
}
