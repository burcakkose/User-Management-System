package user.m.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.m.system.model.User;
import user.m.system.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> getUsers() {
		return repository.findAll();
	}

	public User getUserById(int id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteUser(int id) {
		repository.deleteById(id);
		return "user removed "+id;
	}

	public User updateUser(User user) {
		User existingUser = repository.findById(user.getId()).orElse(null);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmailAddress(user.getEmailAddress());
		existingUser.setDateOfBirth(user.getDateOfBirth());

		return repository.save(existingUser);

	}

}
