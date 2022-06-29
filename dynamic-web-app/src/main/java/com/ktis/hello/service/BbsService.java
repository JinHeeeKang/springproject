package com.ktis.hello.service;

import com.ktis.hello.dao.ArticleDAO;
import com.ktis.hello.dao.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BbsService {

    @Autowired//자동 setter
    private ArticleDAO articleDAO;

//    public void setArticleDAO(ArticleDAO dao) {
//        this.articleDAO = dao;
//    }

    public void registArticle(Article article){
        articleDAO.insertArticle(article);
    }


    public Article viewArticleDetail(String articleId) {
        return this.articleDAO.selectArticleById(articleId);
    }
}
