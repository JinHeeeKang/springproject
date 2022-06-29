package com.ktis.hello.controller;

import com.ktis.hello.dao.vo.Article;
import com.ktis.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String doWrite(){
        System.out.println("POST request");
        bbsService.registArticle(new Article());
        return "write_ok";
    }

    @GetMapping("/write")
    public String write(){
        System.out.println("GET request");
        bbsService.registArticle(new Article());
        return "write_ok";
    }
}
