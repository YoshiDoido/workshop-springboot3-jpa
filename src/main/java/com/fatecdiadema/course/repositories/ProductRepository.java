package com.fatecdiadema.course.repositories;

import com.fatecdiadema.course.entities.Category;
import com.fatecdiadema.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
