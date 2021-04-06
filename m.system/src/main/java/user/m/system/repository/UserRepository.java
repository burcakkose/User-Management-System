package user.m.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.m.system.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
