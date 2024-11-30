package com.online.user.service;

import java.util.List;

import com.online.user.dto.UserDTO;
import com.online.user.model.User;

public interface UserService {

	public List<UserDTO> getallUsers();
	public User addUser(User user);
	public User updateUser(User user,long userId);
	public User getUserById(long userId);
	public void deleteUserById(long userId);

	
}
