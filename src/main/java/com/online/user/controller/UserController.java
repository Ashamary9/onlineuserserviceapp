package com.online.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.user.dto.UserDTO;
import com.online.user.model.User;
import com.online.user.service.UserService;



@RestController
@RequestMapping("api/v1")
public class UserController {

	
	@Autowired
	private UserService userser;

	
	@GetMapping("/getallUsers")
    public List<UserDTO> getallUsersInfo() {
        return userser.getallUsers();
    }

	
	@PostMapping("/addUsers")
	public User addUserInfo(@RequestBody User user) {
		
		return userser.addUser(user);
		
	}

	
	@PutMapping("/updateUserbyid/{userId}")
	public User updateUserInfo(@RequestBody User user,@PathVariable long userId) {
		
		
        return userser.updateUser(user, userId);
		
		}

	
	@GetMapping("/getuserbyid/{userId}")
	public User getUserInfoById(@PathVariable long userId) {
		
		
		return userser.getUserById(userId);
		
	}


	@DeleteMapping("/deleteUserbyid/{userId}")
	public void deleteUserById(@PathVariable long userId) {

		userser.deleteUserById(userId);;
		
	}
	
	

	
	
}
