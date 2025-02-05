package com.example.treino_noturno.ratings;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingsService {
    private final RatingsMapper mapper;
    private final RatingsRepository repository;

    public RatingsService(RatingsMapper mapper, RatingsRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    public List<RatingsDto> findAllRatings() {
        return repository.findAll()
                .stream()
                .map(mapper::toRatingDto)
                .collect(Collectors.toList());
    }

    public RatingsDto saveRatings(RatingsDto dto) {
        return mapper.toRatingDto(repository.save(mapper.toRating(dto)));
    }

    public RatingsDto findRatingsById(int id) {
        return mapper.toRatingDto(repository.findById(id).orElse(null));
    }

    public void deleteRatingsById(int id) {
        repository.deleteById(id);
    }
}
