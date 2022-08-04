package net.javaguides.streamingPortal.service.impl;
import org.springframework.stereotype.Service;

import net.javaguides.streamingPortal.model.User;
import net.javaguides.streamingPortal.service.UserService;
import net.javaguides.streamingPortal.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	private UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository; 
	}
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
}
