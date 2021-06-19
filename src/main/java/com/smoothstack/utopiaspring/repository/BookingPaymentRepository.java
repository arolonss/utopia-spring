package com.smoothstack.utopiaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaspring.model.BookingPayment;

@Repository
public interface BookingPaymentRepository extends JpaRepository<BookingPayment, Integer>{

}
