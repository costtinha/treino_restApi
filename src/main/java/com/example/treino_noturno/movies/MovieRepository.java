package com.example.treino_noturno.movies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movies,Integer> {
}
