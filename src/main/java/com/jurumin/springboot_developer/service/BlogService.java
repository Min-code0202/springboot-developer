package com.jurumin.springboot_developer.service;

import com.jurumin.springboot_developer.domain.Article;
import com.jurumin.springboot_developer.dto.AddArticleRequest;
import com.jurumin.springboot_developer.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {return blogRepository.findAll();}
}
