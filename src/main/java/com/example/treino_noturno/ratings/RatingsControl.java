package com.example.treino_noturno.ratings;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingsControl {
    private final RatingsService service;

    public RatingsControl(RatingsService service) {
        this.service = service;
    }
    @GetMapping("/ratings")
    public List<RatingsDto> findAllRatings(){
        return service.findAllRatings();
    }

    @PostMapping("/ratings")
    public RatingsDto saveRatings(
            @RequestBody RatingsDto dto
    ){
        return service.saveRatings(dto);
    }

    @GetMapping("/ratings/{ratings-id}")
    public RatingsDto findRatingsById(
            @PathVariable("ratings-id") int id
    ){
        return service.findRatingsById(id);
    }

    @DeleteMapping("/ratings/{ratings-id}")
    public void deleteRatingsById(
            @PathVariable("ratings-id")int id
    ){
        service.deleteRatingsById(id);
    }
}
