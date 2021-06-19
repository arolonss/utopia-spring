package com.smoothstack.utopiaspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Airplane;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {

	
}
