package com.te.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.te.blog.entity.User;
@Repository
public interface AdminRepository extends JpaRepository<User, Integer>{
//	
//             User getUserByUserName(String username);
//
//	@Query("select u from User u where u.email = : email")
//	public User getUserByUserName(@Param("email") String email); 
	

	

}
