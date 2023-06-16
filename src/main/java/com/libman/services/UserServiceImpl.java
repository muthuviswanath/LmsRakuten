package com.libman.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.libman.dao.UsersDao;
import com.libman.models.Login;
import com.libman.models.Users;

public class UserServiceImpl implements UserService{

	 @Autowired
	    public UsersDao userDao;

	    @Override
	    public int register(Users user) {
	    return userDao.register(user);        
	    }

	    @Override
	    public Users validateUser(Login login) {    
	    return userDao.validateUser(login);
	    }
}
