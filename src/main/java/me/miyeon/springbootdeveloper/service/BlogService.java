package me.miyeon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.miyeon.springbootdeveloper.domain.Article;
import me.miyeon.springbootdeveloper.dto.AddArticleRequest;
import me.miyeon.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
