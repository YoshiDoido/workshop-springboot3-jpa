package com.fatecdiadema.course.repositories;

import com.fatecdiadema.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
