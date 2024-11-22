package com.students_management_system.Service;

import com.students_management_system.Model.User;
import com.students_management_system.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

   private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(12);
    public User save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
