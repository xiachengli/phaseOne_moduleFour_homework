package com.xcl.blog.mapper;

import com.xcl.blog.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {

    @Select("select * from t_article")
    List<Article> list();
}
