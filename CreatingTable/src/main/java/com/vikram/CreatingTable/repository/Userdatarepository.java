package com.vikram.CreatingTable.repository;

import com.vikram.CreatingTable.models.Userdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdatarepository extends JpaRepository<Userdata, Integer> {

}
