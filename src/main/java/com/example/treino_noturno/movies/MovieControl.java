package com.example.treino_noturno.movies;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieControl {
    private final MovieService service;

    public MovieControl(MovieService service) {
        this.service = service;
    }

    @GetMapping("/movies")
    public List<MovieDto> findAllMovies(){
        return service.findAllMovies();
    }

    @PostMapping("/movies")
    public MovieDto saveMovie(
            @RequestBody MovieDto dto
    ){
        return service.saveMovie(dto);
    }

    @GetMapping("/movies/{movie-id}")
    public MovieDto findMovieById(
            @PathVariable("movie-id") int id
    ){
        return service.findMovieById(id);
    }
    @DeleteMapping("/movies/{movie-id}")
    public void deleteMovieById(
            @PathVariable("movie-id") int id
    ){
        service.deleteMovieById(id);
    }
}
