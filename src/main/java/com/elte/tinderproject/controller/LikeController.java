package com.elte.tinderproject.controller;

import com.elte.tinderproject.model.Like;
import com.elte.tinderproject.service.LikeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class LikeController {
    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping("/likes")
    public Iterable<Like> get_all() {
        return likeService.get_all();
    }

    @GetMapping("/likes/{id}")
    public Like get_one(@PathVariable("id") long id) {
        return likeService.get_one(id);
    }

    @PutMapping("/likes")
    public void put_one(@RequestBody Like like) {
        System.out.println(like);
        likeService.put_one(like);
    }

    @DeleteMapping("/likes/{id}")
    public void delete_one(@PathVariable("id") long id) {
        likeService.delete_one(id);
    }
}
