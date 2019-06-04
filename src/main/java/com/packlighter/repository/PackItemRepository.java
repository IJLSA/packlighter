package com.packlighter.repository;

import com.packlighter.model.PackItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackItemRepository extends JpaRepository<PackItem, String> {


}
