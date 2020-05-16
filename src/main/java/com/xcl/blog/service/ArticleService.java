package com.xcl.blog.service;

import com.github.pagehelper.PageInfo;
import com.xcl.blog.pojo.Article;

import java.util.Map;

public interface ArticleService {

    PageInfo<Article> list(Integer pageNum);
}
