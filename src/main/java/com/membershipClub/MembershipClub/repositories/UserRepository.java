package com.membershipClub.MembershipClub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.membershipClub.MembershipClub.domain.User;

public interface UserRepository extends JpaRepository<User , Long> {
    
}
