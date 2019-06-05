package com.packlighter.repository;

import com.packlighter.model.PackCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackCategoryRepository extends JpaRepository<PackCategory, String> {

}