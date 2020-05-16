package com.xcl.blog.pojo;

import java.util.Date;

public class Article {
    //编号
    private Integer id;
    //标题
    private String title;
    //正文内容
    private String content;
    //创建时间
    private Date created;
    //修改时间
    private Date modified;
    //所属分类
    private String categories;
    //标签
    private String tags;
    //是否允许评论 0否；1是
    private Short allowComment;
    //缩略图
    private String thumbNail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Short getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Short allowComment) {
        this.allowComment = allowComment;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }
}
