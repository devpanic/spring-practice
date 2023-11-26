package me.miyeon.springbootdeveloper.repository;

import me.miyeon.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
