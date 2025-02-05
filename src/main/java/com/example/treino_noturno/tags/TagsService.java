package com.example.treino_noturno.tags;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TagsService {
    private final TagsRepository repository;
    private final TagsMapper mapper;

    public TagsService(TagsRepository repository, TagsMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<TagsDto> findAllTags() {
        return repository.findAll()
                .stream()
                .map(mapper::toTagsDto)
                .collect(Collectors.toList());
    }

    public TagsDto saveTags(TagsDto dto) {
        return mapper.toTagsDto(repository.save(mapper.toTags(dto)));
    }

    public TagsDto findTagsByKey(int userId, int movieId) {
        Tags_Key key = new Tags_Key(userId,movieId);
        return mapper.toTagsDto(repository.findById(key).orElse(null));
    }

    public void deleteTagsByKey(int userId, int movieId) {
        Tags_Key key = new Tags_Key(userId,movieId);
        repository.deleteById(key);
    }
}
