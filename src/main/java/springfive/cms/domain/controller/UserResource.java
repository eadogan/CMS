package springfive.cms.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfive.cms.domain.models.User;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") String id){
        return ResponseEntity.ok(new User());
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(Collections.singletonList(new User()));
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(new User(), HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id")String id,User user){
        return new ResponseEntity<>(new User(), HttpStatus.OK);
    }

    @PatchMapping(value = "/id")
    public ResponseEntity deleteUser(@PathVariable("id")String id){
        return ResponseEntity.noContent().build();
    }

}
