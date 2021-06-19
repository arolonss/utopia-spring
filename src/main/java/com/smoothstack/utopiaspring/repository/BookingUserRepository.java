package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.BookingUser;

@Repository
public interface BookingUserRepository extends JpaRepository<BookingUser, Integer>{

}
