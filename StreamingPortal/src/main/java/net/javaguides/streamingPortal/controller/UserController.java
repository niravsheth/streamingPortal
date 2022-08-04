package net.javaguides.streamingPortal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.streamingPortal.model.User;
import net.javaguides.streamingPortal.service.UserService;

@RestController
@RequestMapping(value="/api/users")
public class UserController {
	
	private final UserService userService;

	private UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping()
	public ResponseEntity<User> addUser(@RequestBody User user){
		if(user.firstName.length()==0) {
			return null;
		}
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
}
