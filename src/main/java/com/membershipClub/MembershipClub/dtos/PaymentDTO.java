package com.membershipClub.MembershipClub.dtos;

import java.time.LocalDateTime;

import com.membershipClub.MembershipClub.domain.User;


public record PaymentDTO(Double price, LocalDateTime date, User paid, User delay) {
    
}
