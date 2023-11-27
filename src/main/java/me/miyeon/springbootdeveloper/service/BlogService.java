package me.miyeon.springbootdeveloper.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.miyeon.springbootdeveloper.domain.Article;
import me.miyeon.springbootdeveloper.dto.AddArticleRequest;
import me.miyeon.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));
    }
}
