package com.winter_spring_backend.winter_spring_backend.model.repository;

import com.winter_spring_backend.winter_spring_backend.model.entity.posts.Post;
import com.winter_spring_backend.winter_spring_backend.model.entity.songs.Song;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SongRepository {
    private final EntityManager em;
    public void save(Song song) {
        em.persist(song);
    }
    public Song findById(Long id) {
        return em.find(Song.class, id);
    }
    public List<Song> findByName(String name) {
        return em.createQuery("select s from Song s where s.name = :name", Song.class).setParameter("name", name).getResultList();
    }
    public List<Song> findByArtist(String artist) {
        return em.createQuery("select s from Song s where s.artist = :artist", Song.class).setParameter("artist", artist).getResultList();
    }
    public List<Song> findAll() {
        return em.createQuery("select s from Song s", Song.class).getResultList();
    }
}
