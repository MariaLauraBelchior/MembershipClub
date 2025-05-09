package com.membershipClub.MembershipClub.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.membershipClub.MembershipClub.domain.User;
import com.membershipClub.MembershipClub.dtos.UserDTO;
import com.membershipClub.MembershipClub.repositories.UserRepository;
import com.membershipClub.MembershipClub.service.exception.InvalidUserException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User searchUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new InvalidUserException("Usuário não encontrado");
        }
        return user.get();
    }

    public User registerUser(UserDTO userDTO) {
        User newUser = new User();
        this.saveUser(newUser);
        return newUser;
    }

    public void saveUser(User user){
        this.userRepository.save(user);
    }

}
