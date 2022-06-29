package com.ktis.hello.dao;

import com.ktis.hello.dao.vo.Article;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {
    public void insertArticle(Article article) {
        System.out.println("article = " + article);
    }
}
