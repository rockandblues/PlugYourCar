package com.plugyourcar.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plugyourcar.backend.model.Conector;

@Repository
public interface ConectorRepository extends JpaRepository<Conector, Integer> {
	
	Conector findOne(Integer id);
	
}
