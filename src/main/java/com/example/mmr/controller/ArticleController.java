package com.example.mmr.controller;

import com.example.mmr.mapper.ArticleMapper;
import com.example.mmr.po.Article;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jasper Wu
 * @date 6/4/2019
 **/
@RestController
@RequestMapping("articles")
public class ArticleController {
    @Resource
    private ArticleMapper articleMapper;

    @GetMapping
    public List<Article> getAll() {
//        return Arrays.asList(Article.builder().id("101").title("title01").content("content01").build());
        return articleMapper.getAll();
    }

    @PutMapping
    public void insert(@RequestBody Article article) {
        articleMapper.insert(article);
    }
}
