package com.packlighter.repository;

import com.packlighter.model.PackItem;
import com.packlighter.model.PackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackListRepository extends JpaRepository<PackList, String> {


}
