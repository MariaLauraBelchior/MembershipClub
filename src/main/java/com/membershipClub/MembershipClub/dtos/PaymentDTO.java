package com.membershipClub.MembershipClub.dtos;

import java.time.LocalDateTime;

import com.membershipClub.MembershipClub.domain.UserStatus;

public record PaymentDTO(Double price, LocalDateTime date, UserStatus userStatus) {
    
}
