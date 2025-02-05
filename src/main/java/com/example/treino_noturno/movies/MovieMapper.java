package com.example.treino_noturno.movies;

import org.springframework.stereotype.Service;

@Service
public class MovieMapper {
    public MovieDto toMovieDto(Movies movies){
        return new MovieDto(movies.getName(), movies.getText());
    }
    public Movies toMovies(MovieDto dto){
        return new Movies(dto.name(), dto.text());
    }
}
