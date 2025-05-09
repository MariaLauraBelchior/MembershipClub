package com.membershipClub.MembershipClub.service.exception;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
       super(message); 
    }
}
