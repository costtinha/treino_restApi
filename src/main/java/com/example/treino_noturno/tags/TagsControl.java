package com.example.treino_noturno.tags;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagsControl {
    private final TagsService service;

    public TagsControl(TagsService service) {
        this.service = service;
    }
    @GetMapping("/tags")
    public List<TagsDto> findAllTagsDto(){
        return service.findAllTags();
    }

    @PostMapping("/tags")
    public TagsDto saveTags(
            @RequestBody TagsDto dto
    ){
        return service.saveTags(dto);
    }
    @GetMapping("/tags/{user-id}/{movie-id}")
    public TagsDto findTagsByKey(
            @PathVariable("user-id") int user_id,
            @PathVariable("movie-id") int movie_id
    ){
        return service.findTagsByKey(user_id,movie_id);
    }
    @DeleteMapping("/tags/{user-id}/{movie-id}")
    public void delteTagsByKey(
            @PathVariable("user-id") int user_id,
            @PathVariable("movie-id") int movie_id
    ){
         service.deleteTagsByKey(user_id,movie_id);
    }

}
