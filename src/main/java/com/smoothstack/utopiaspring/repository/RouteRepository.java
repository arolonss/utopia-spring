package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
