package com.project.omss.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.project.omss.entity.User;

public interface UserJpaRepository extends CrudRepository<User, String>{

	User findByUserId(int userId);

	@Query("select u from User u where u.userId=:userId AND u.password=:password")
	public User loginUser(@Param("userId") int userId,@Param("password") String password);

}
