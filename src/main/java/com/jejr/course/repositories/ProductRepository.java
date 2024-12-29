package com.jejr.course.repositories;

import com.jejr.course.entities.Category;
import com.jejr.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
