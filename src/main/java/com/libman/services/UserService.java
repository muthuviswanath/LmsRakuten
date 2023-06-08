package com.libman.services;

import com.libman.models.Login;
import com.libman.models.Users;

public interface UserService {
	 int register(Users user);
	 Users validateUser(Login login);
}
