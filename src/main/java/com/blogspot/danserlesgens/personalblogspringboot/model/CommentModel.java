package com.blogspot.danserlesgens.personalblogspringboot.model;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("Comment")
public class CommentModel {
    private Integer id;
    private ArticleModel article;
    private UserModel user;
    private String content;
    private Date releaseTime;
    private Integer likeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticleModel getArticle() {
        return article;
    }

    public void setArticle(ArticleModel article) {
        this.article = article;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "id=" + id +
                ", article=" + article +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", releaseTime=" + releaseTime +
                ", likeNum=" + likeNum +
                '}';
    }
}
