package com.example.treino_noturno.movies;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private final MovieRepository repository;
    private final MovieMapper mapper;

    public MovieService(MovieRepository repository, MovieMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<MovieDto> findAllMovies() {
        return repository.findAll()
                .stream()
                .map(mapper::toMovieDto)
                .collect(Collectors.toList());
    }

    public MovieDto saveMovie(MovieDto dto) {
        return mapper.toMovieDto(repository.save(mapper.toMovies(dto)));
    }

    public MovieDto findMovieById(int id) {
        return mapper.toMovieDto(repository.findById(id).orElse(null));
    }

    public void deleteMovieById(int id) {
        repository.deleteById(id);
    }
}
