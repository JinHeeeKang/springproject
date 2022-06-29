package com.ktis.hello.dao;

import com.ktis.hello.dao.vo.Article;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAO {
    public void insertArticle(Article article) {
        Article article1 = new Article();

        Article article2 = new Article();
        System.out.println("insert OK ");
    }
}
