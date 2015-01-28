package com.jacarrichan.research.sm.service;

import java.util.List;

import com.jacarrichan.research.sm.model.User;

public interface UserServiceI {

	List<User> getAll();
	
	User selectByPrimaryKey(String id);
	
    int insert(User muser);
    
    int update(User muser);
    
    int delete(String id);
}
