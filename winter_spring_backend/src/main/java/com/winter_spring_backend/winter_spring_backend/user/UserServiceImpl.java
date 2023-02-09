package com.winter_spring_backend.winter_spring_backend.user;

import com.winter_spring_backend.winter_spring_backend.user.jpa.UserEntity;
import com.winter_spring_backend.winter_spring_backend.user.jpa.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String userid) {
        UserEntity userEntity = userRepository.findByUsername(userid);
        return User.of(userEntity);
    }
}
