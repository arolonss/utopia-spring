package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.BookingAgent;

@Repository
public interface BookingAgentRepository extends JpaRepository<BookingAgent, Integer> {

}
