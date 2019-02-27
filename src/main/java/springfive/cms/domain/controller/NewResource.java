package springfive.cms.domain.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfive.cms.domain.models.News;
import springfive.cms.domain.models.Review;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<News> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new News());
    }

    @GetMapping
    public ResponseEntity<List<News>> findAll(){
        return ResponseEntity.ok(Collections.singletonList(new News()));
    }

    @PostMapping
    public ResponseEntity<News> saveNews(@RequestBody News news){
        return new ResponseEntity<>(new News(), HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<News> updateNews(@PathVariable("id")String id, @RequestBody News news){
        return new ResponseEntity<>(new News(), HttpStatus.OK);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<News> deleteNews(@PathVariable("id")String id){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @GetMapping(value = "/{id}/review/{userId}")
    public ResponseEntity<Review> review(@PathVariable("id") String id, @PathVariable("userId")String userId){
        return ResponseEntity.ok(new Review());
    }

    @GetMapping(value = "/revised")
    public ResponseEntity<List<News>> revisedNews(){
        return ResponseEntity.ok(Collections.singletonList(new News()));
    }
}
