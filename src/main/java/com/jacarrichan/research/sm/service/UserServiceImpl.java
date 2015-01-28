package com.jacarrichan.research.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacarrichan.research.sm.dao.UserMapper;
import com.jacarrichan.research.sm.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI{

	private UserMapper userMapper;
		
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper muserMapper) {
		this.userMapper = muserMapper;
	}
	
	@Override
	public List<User> getAll() {
		
		return userMapper.getAll();
	}

	@Override
	public int insert(User muser) {
		
		return userMapper.insert(muser);
	}

	@Override
	public int update(User muser) {
		
		return userMapper.updateByPrimaryKey(muser);
	}

	@Override
	public int delete(String id) {
	
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User selectByPrimaryKey(String id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

}
