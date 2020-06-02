package com.blogspot.danserlesgens.personalblogspringboot.controller;

import com.blogspot.danserlesgens.personalblogspringboot.model.ArticleModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.IArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    private IArticleService as;

    @Autowired
    public void setAs(IArticleService as) {
        this.as = as;
    }

    @RequestMapping("/add")
    public ArticleModel add(@RequestBody ArticleModel am){
        as.add(am);
        System.out.println(am);
        return am;
    }

    @RequestMapping("/modify")
    public void modify(@RequestBody ArticleModel am){
        as.modify(am);
    }

    @RequestMapping("/remove")
    public void remove(@RequestBody ArticleModel am){
        as.remove(am);
    }

    @RequestMapping("/getListBySearchText")
    public PageInfo<ArticleModel> getListBySearchText(int pageNo, int pageSize, String searchText){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(as.getListBySearchText(searchText));
    }

    @RequestMapping("/getArticleById")
    public ArticleModel getArticleById(int id){
        return as.getArticleById(id);
    }

}
