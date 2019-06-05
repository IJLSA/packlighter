package com.packlighter.repository;

import com.packlighter.model.PackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PackListRepository extends JpaRepository<PackList, String> {

    Optional<PackList> findByListName(String packListName );
}
