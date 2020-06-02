package com.blogspot.danserlesgens.personalblogspringboot.service;

import com.blogspot.danserlesgens.personalblogspringboot.model.ArticleModel;

import java.util.List;

public interface IArticleService {
    int add(ArticleModel am);
    void modify(ArticleModel am);
    void remove(ArticleModel am);
    List<ArticleModel> getListBySearchText(String searchText);
    ArticleModel getArticleById(int id);
}
