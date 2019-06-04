package com.example.mmr.mapper;

import com.example.mmr.po.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {
    @Resource
    private ArticleMapper articleMapper;

    @Test
    public void testInsert() {
        articleMapper.insert(Article.builder().title("title01").content("Content01").build());
        articleMapper.insert(Article.builder().title("title02").content("Content02").build());
        articleMapper.insert(Article.builder().title("title03").content("Content03").build());
        assertThat(articleMapper.getAll().size()).isEqualTo(3);
    }
}