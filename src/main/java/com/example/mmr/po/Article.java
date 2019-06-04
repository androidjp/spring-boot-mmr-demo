package com.example.mmr.po;

import lombok.Builder;
import lombok.Data;

/**
 * @author Jasper Wu
 * @date 6/4/2019
 **/
@Data
@Builder
public class Article {
    private String id;
    private String title;
    private String content;
    private Author author;
}
