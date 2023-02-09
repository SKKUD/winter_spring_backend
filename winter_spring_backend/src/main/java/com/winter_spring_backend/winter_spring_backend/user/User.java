package com.winter_spring_backend.winter_spring_backend.user;

import com.winter_spring_backend.winter_spring_backend.user.jpa.UserEntity;

public class User {
    private final Long id;
    private final String userid;
    private final String password;
    private final String email;

    public User(Long id, String userid, String password, String email) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.email = email;
    }

    public static User of(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUserid(), userEntity.getPassword(),
                userEntity.getEmail());
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return email;
    }
}
