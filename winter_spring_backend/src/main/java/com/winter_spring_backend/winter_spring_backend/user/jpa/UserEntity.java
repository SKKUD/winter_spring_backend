package com.winter_spring_backend.winter_spring_backend.user.jpa;

import jakarta.persistence.*;

@Table(name = "member")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userid;
    private String password;
    @Column(unique = true)
    private String email;

    public Long getId() { return id; }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
