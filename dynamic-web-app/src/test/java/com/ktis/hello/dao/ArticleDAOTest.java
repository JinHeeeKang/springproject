package com.ktis.hello.dao;

import com.ktis.hello.dao.vo.Article;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ArticleDAOTest {
    @Test
    public void testSelectArticleById(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/*.xml");
        ArticleDAO dao = ctx.getBean("articleDAO",ArticleDAO.class);
        Article article = dao.selectArticleById(null);

        Assert.assertTrue(article.getAuthor().equals("lee"));

    }
}
