package com.ktis.hello.dao;

import com.ktis.hello.dao.vo.Article;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {
    public void insertArticle(Article article) {
        System.out.println("article = " + article);
    }

    public Article selectArticleById(String articleId) {
        Article article = new Article(10,"lee","test","테스트입니다.");
        return article;

    }
}
