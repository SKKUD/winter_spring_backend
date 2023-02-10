package com.winter_spring_backend.winter_spring_backend.model.entity.users;

import com.winter_spring_backend.winter_spring_backend.model.entity.posts.Post;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User { // temporary

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

//    private String nickname;

//    @OneToMany
//    private List<Post> posts = new ArrayList<>();
}
