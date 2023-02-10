package com.winter_spring_backend.winter_spring_backend.model.entity.posts;

import com.winter_spring_backend.winter_spring_backend.model.entity.songs.Song;
import com.winter_spring_backend.winter_spring_backend.model.entity.users.User;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Post {

    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "song_id")
    private Song song;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String customLyric;

    @Column(nullable = false)
    private LocalDateTime dateTime;
}
