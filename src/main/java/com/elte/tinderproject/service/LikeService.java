package com.elte.tinderproject.service;

import com.elte.tinderproject.model.Like;
import com.elte.tinderproject.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    private final LikeRepository likeRepo;

    @Autowired
    public LikeService(LikeRepository likeRepo) {
        this.likeRepo = likeRepo;
    }

    public Iterable<Like> get_all() {
        return likeRepo.findAll();
    }

    public Like get_one(long id) {
        return likeRepo.findById(id).orElse(null);
    }

    public void put_one(Like like) {
        likeRepo.save(like);
    }

    public void delete_one(long id) {
        likeRepo.deleteById(id);
    }
}
