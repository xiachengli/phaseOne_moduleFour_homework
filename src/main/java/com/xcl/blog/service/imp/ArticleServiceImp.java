package com.xcl.blog.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xcl.blog.mapper.ArticleMapper;
import com.xcl.blog.pojo.Article;
import com.xcl.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImp implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public PageInfo<Article> list(Integer pageNum) {
        pageNum = pageNum == null ? 1 : pageNum;
        Integer size = 3;
        PageHelper.startPage(pageNum,size);
        List<Article> list = articleMapper.list();
        return new PageInfo<>(list);
    }
}
