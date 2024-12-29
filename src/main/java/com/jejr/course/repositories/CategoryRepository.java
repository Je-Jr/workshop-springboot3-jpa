package com.jejr.course.repositories;

import com.jejr.course.entities.Category;
import com.jejr.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
