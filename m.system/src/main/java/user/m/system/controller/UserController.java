package user.m.system.controller;

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

import user.m.system.model.User;
import user.m.system.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping
	public List<User> getAllUsers(){
		return service.getUsers();
	}

	@GetMapping("{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@PutMapping
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@DeleteMapping("{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
