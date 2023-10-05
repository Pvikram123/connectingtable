package com.vikram.CreatingTable.repository;

import com.vikram.CreatingTable.models.UserincomeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserincomeTyperepository extends JpaRepository<UserincomeType,Integer> {
}
