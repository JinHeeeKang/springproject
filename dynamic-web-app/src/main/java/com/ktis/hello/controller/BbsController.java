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
    public String viewDetail(@PathVariable String articleId){
        System.out.println("글번호는: "+ articleId);
        return "write_ok";
    }

    @PostMapping("/write")
    public ModelAndView doWrite(Article article){
        bbsService.registArticle(article);
        System.out.println("POST request");
        return new ModelAndView("write_ok").addObject("article",article);
    }

    @GetMapping("/write")
    public String write(){
        System.out.println("GET request");
        bbsService.registArticle(new Article());
        return "write_ok";
    }
}
