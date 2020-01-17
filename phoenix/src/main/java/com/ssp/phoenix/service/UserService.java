package com.ssp.phoenix.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ssp.phoenix.model.LoggedInUserDetails;
import com.ssp.phoenix.model.Users;
import com.ssp.phoenix.repository.UsersRepository;

@Service
public class UserService {

	@Autowired
	UsersRepository userRepository;

	public String login(String userId, String password) {
		try {
			Users users = getUserDetailsByID(userId);
			if (!StringUtils.isEmpty(users)) {
				if (!StringUtils.isEmpty(password) && password.equals(users.getPassword())) {
					LoggedInUserDetails.userID = userId;
					LoggedInUserDetails.isAdmin = users.getIsAdmin();
					System.out.println("static data" + LoggedInUserDetails.userID + LoggedInUserDetails.isAdmin);
					return "Login successfull";
				} else {
					return "Invalid password";
				}
			}
		} catch (Exception e) {
			System.out.println("error in login****" + e);
		}
		return "Invalid userId or password";
	}

	public String userIdVarification(String userId) {
		Users usersInDB = getUserDetailsByID(userId);
		if (!StringUtils.isEmpty(usersInDB) && usersInDB.getUser_id().equals(userId)) {
			return "User Id is already exists, Please Signup with new ID";
		} else {
			return "UserId is correct";
		}
	}

	public String signup(Users users) {
		try {
			userRepository.save(users);
		} catch (Exception e) {
			System.out.println("error in signup" + e);
			return "SignUp failed, Please contact support team";
		}
		return "SignUp is successfull";
	}

	public Users getUserDetailsByID(String userId) {
		Users users = null;
		try {
			users = userRepository.findByUser_id(userId);
		} catch (Exception e) {
			System.out.println("error in getUserDetailsByID" + e);
		}
		return users;
	}

	public String delete(String userId) {
		try {
			userRepository.deleteByUser_id(userId);
		} catch (Exception e) {
			System.out.println("error in delete" + e);
			return "Delete failed, Please contact support team";
		}
		return "Record deleted successfully";
	}

	public String update(Users users) {
		try {
			userRepository.updateUser(users.getMobileNumber(), users.getBloodGroup(), users.getEmailId(),
					users.getAge(), users.getPassword(), users.getAddress(), users.getName(), users.getUser_id());
		} catch (Exception e) {
			System.out.println("error in update" + e);
			return "Update failed, Please contact support team";
		}
		return "Record updated successfully";
	}
	
	public Collection<Users> getAllUser() {
		return userRepository.findAll();
	}
	
	public Collection<Users> getBloodFinderDetails(String bloodGroup, String address) {
		return userRepository.getBloodFinderUsers(bloodGroup, address);
	}
	
	public void insertBloodFinderHistoryTbl(String name, String bloodGroup,
			String mobileNumber,String note, String address) {
		userRepository.insertBloodFinderHistoryTbl(name, bloodGroup, mobileNumber, note, address);
	}
}
