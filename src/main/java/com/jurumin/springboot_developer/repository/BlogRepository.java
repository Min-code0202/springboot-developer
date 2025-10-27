package com.jurumin.springboot_developer.repository;

import com.jurumin.springboot_developer.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
