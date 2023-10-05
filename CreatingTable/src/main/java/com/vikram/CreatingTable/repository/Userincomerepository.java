package com.vikram.CreatingTable.repository;

import com.vikram.CreatingTable.models.Userincome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userincomerepository extends JpaRepository<Userincome,Integer> {
}
