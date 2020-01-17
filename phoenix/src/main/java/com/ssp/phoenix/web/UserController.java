package com.ssp.phoenix.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssp.phoenix.model.Users;
import com.ssp.phoenix.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login(String userId, String password) {
		System.out.println("userId**login***" + userId + password);
		return userService.login(userId, password);
	}

	@GetMapping("/userIdVarification")
	public String userIdVarification(String userId) {
		return userService.userIdVarification(userId);
	}

	@GetMapping("/signup")
	public String signup(@ModelAttribute Users users) {
		Users usersdemo = new Users("divine15", "a", "e", "a", "m", "a", "true", "a", "d");
		System.out.println("users**signup**" + usersdemo);
		return userService.signup(usersdemo);
	}

	@GetMapping("/delete")
	public String delete(String userId) {
		System.out.println("users**delete**" + userId);
		return userService.delete(userId);
	}

	@GetMapping("/update")
	public String update(@ModelAttribute Users users) {
		Users usersdemo = new Users("divine12", "divine", "divine@gmail.com", "a", "m", "a", "true", "a", "divine");
		System.out.println("users**update**" + usersdemo);
		return userService.update(usersdemo);
	}

	@GetMapping("/getUserDetails")
	public Users getUserDetails(String userId) {
		System.out.println("users**update**" + userId);
		return userService.getUserDetailsByID(userId);
	}

	@GetMapping("/getAllUser")
	public Collection<Users> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("/getBloodFinderDetails")
	public Collection<Users> getBloodFinderDetails(String name, String bloodGroup,
			String mobileNumber,String note, String address) {
		//Users usersdemo = new Users("divine12", "divine", "divine@gmail.com", "a", "m", "a", "true", "a", "divine");
		bloodGroup = "a";
		address = "a";
		userService.insertBloodFinderHistoryTbl(name, bloodGroup, mobileNumber, note, address);
		return userService.getBloodFinderDetails(bloodGroup, address);
	}
}
