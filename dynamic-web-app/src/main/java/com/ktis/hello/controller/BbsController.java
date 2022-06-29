package com.ktis.hello.controller;

import com.ktis.hello.dao.vo.Article;
import com.ktis.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService bbsService;

    @GetMapping("/{articleId}")
    @ResponseBody//리턴하는걸 그대로 리턴받아라
    public Article viewDetail(@PathVariable String articleId){
        Article article =  this.bbsService.viewArticleDetail(articleId);
        return article;
    }


    @PostMapping("/write")
    @ResponseBody
    public Article write(@RequestBody Article article){
        Article a = article;
        return a;
    }


    @GetMapping("/write")
    public String write(){
        System.out.println("GET request");
        bbsService.registArticle(new Article());
        return "write_ok";
    }
}
