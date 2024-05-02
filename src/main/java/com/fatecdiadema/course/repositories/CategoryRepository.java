package com.fatecdiadema.course.repositories;

import com.fatecdiadema.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
