package com.membershipClub.MembershipClub.dtos;

import com.membershipClub.MembershipClub.domain.UserStatus;

public record UserDTO(String name, String email, UserStatus userStatus) {
    
}
