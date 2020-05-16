package com.xcl.blog.controller;

import com.github.pagehelper.PageInfo;
import com.xcl.blog.pojo.Article;
import com.xcl.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    public ModelAndView list(Integer pageNum){
        PageInfo<Article> pageInfo = articleService.list(pageNum);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("client/index");
        mv.addObject("pageInfo",pageInfo);
        mv.addObject("articles",pageInfo.getList());
        return mv;
    }
}
