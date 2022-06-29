package com.ktis.hello.controller;

import com.ktis.hello.dao.vo.Article;
import com.ktis.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService bbsService;

    @RequestMapping("/write")
    public String write(@RequestParam("author") String author){

        System.out.println(author);
        bbsService.registArticle(new Article());

        return "write_ok";
    }
}
