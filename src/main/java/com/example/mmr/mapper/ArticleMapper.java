package com.example.mmr.mapper;

import com.example.mmr.po.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Jasper Wu
 * @date 6/4/2019
 **/
public interface ArticleMapper {
    @Select("SELECT * FROM articles")
    @Results({
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content")
    })
    List<Article> getAll();

    @Select("SELECT * FROM articles WHERE id = #{id}")
    @Results({
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content")
    })
    Article getOne(String id);

    @SelectKey(keyProperty = "id", resultType = String.class, before = true,
            statement = "select replace (uuid(), '-', '')")
    @Options(keyProperty = "article.id", useGeneratedKeys = true)
    @Insert("INSERT INTO articles(id,title,content) VALUES(#{id}, #{title}, #{content})")
    void insert(Article article);

    @Insert("UPDATE articles SET title=#{title}, content=#{content} WHERE id=#{id}")
    void update(Article article);

    @Delete("DELETE FROM articles WHERE id = #{id}")
    void delete(String id);
}
