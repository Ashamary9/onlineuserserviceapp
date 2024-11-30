package com.online.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
