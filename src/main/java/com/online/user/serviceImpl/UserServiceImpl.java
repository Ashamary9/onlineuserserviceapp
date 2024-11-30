package com.online.user.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.online.user.dto.UserDTO;
import com.online.user.exception.UserNotFoundException;
import com.online.user.model.User;
import com.online.user.repository.UserRepository;
import com.online.user.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userrepo;
	
	
    @Override
    public List<UserDTO> getallUsers() {
        return userrepo.findAll()
                       .stream()
                       .map(user -> new UserDTO(
                           user.getUserId(),
                           user.getUserName(),
                           user.getEmailId(),
                           user.getPhoneNo(),
                           user.getAddress()))
                       .collect(Collectors.toList());
    }


	@Override
	public User addUser(User user) {
		
		return userrepo.save(user);
		
	}

	@Override
	public User updateUser(User user, long userId) {
		
		Optional<User> us=userrepo.findById(userId);
	
		if(us.isPresent()) {
			User u=us.get();
			u.setUserName(user.getUserName());
			u.setEmailId(user.getEmailId());
			u.setPassword(user.getPassword());
			u.setPhoneNo(user.getPhoneNo());
			u.setAddress(user.getAddress());
			
			return userrepo.save(u);
		}
		else {

			 throw new UserNotFoundException("User not found with ID: " + userId);
		}
		
	
	}

/*	@Override
	public Optional<User> getUserById(long userId) {
		
		
		return userrepo.findById(userId)
				 .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
		
	}

	@Override
	public void deleteUserById(long userId) {

		userrepo.deleteById(userId);
		
	}*/
	

@Override
public User getUserById(long userId) {
    return userrepo.findById(userId)
        .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
}

@Override
public void deleteUserById(long userId) {
    if (!userrepo.existsById(userId)) {
        throw new UserNotFoundException("User not found with ID: " + userId);
    }
    userrepo.deleteById(userId);
}


	
}
