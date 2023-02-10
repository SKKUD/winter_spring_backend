package com.winter_spring_backend.winter_spring_backend.model.entity.songs;

import lombok.Getter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Song {

    @Id @GeneratedValue
    @Column(name = "song_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String artist;

    private String lyric;
}