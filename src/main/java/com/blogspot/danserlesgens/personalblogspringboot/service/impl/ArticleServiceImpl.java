package com.blogspot.danserlesgens.personalblogspringboot.service.impl;

import com.blogspot.danserlesgens.personalblogspringboot.dao.IArticleDao;
import com.blogspot.danserlesgens.personalblogspringboot.model.ArticleModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("articleService")
@Transactional
public class ArticleServiceImpl implements IArticleService {
    private IArticleDao ad;

    @Autowired
    public void setAd(IArticleDao ad) {
        this.ad = ad;
    }

    @Override
    public int add(ArticleModel am) {
        return ad.insert(am);
    }

    @Override
    public void modify(ArticleModel am) {
        ad.update(am);
    }

    @Override
    public void remove(ArticleModel am) {
        ad.delete(am);
    }

    @Override
    public List<ArticleModel> getListBySearchText(String searchText) {
        return ad.selectListBySearchText(searchText);
    }

    @Override
    public ArticleModel getArticleById(int id) {
        return ad.selectArticleById(id);
    }
}
