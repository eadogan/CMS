package springfive.cms.domain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfive.cms.domain.models.Category;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") String identification){
        return ResponseEntity.ok(new Category());
    }

    @GetMapping
    public ResponseEntity<List<Category>> listCategory(){
        return ResponseEntity.ok(Collections.singletonList(new Category()));
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return new ResponseEntity<>(new Category(), HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Category> deleteCategory(@PathVariable("id") String identification){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping
    public ResponseEntity<Category> updateCategory(@PathVariable("id")String identification, Category category){
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }
}
