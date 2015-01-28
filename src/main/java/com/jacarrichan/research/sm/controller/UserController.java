package com.jacarrichan.research.sm.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jacarrichan.research.sm.model.User;
import com.jacarrichan.research.sm.service.UserServiceI;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI muserService) {
		this.userService = muserService;
	}
	
	@RequestMapping(value="/listUser")
	public String listUser(HttpServletRequest request) {
		
		List <User> list = userService.getAll();
		request.setAttribute("userlist", list);
		return "listUser";
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(User muser) {
			
		String id = UUID.randomUUID().toString();
		muser.setId(id);
		userService.insert(muser);
		return "redirect:/user/listUser.do";
	}
	
	@RequestMapping(value="/deleteUser")
	public String deleteUser(String id) {
		
		userService.delete(id);
		return "redirect:/user/listUser.do";
	}
	
	@RequestMapping(value="/updateUserUI")
	public String updateUserUI(String id, HttpServletRequest request) {
		
		User muser = userService.selectByPrimaryKey(id);
		request.setAttribute("user", muser);
		return "updateUser";
	}

	@RequestMapping(value="/updateUser")
	public String updateUser(User muser) {
		
		userService.update(muser);
		return "redirect:/user/listUser.do";
	}
}
