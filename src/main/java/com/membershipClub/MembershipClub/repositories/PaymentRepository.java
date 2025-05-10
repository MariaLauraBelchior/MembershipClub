package com.membershipClub.MembershipClub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.membershipClub.MembershipClub.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment , Long> {
    
}
