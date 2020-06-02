package com.blogspot.danserlesgens.personalblogspringboot.controller;

import com.blogspot.danserlesgens.personalblogspringboot.model.CommentModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.ICommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    private ICommentService cs;

    @Autowired
    public void setCs(ICommentService cs) {
        this.cs = cs;
    }

    @RequestMapping("/add")
    public void add( @RequestBody CommentModel cm){
        cs.add(cm);
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody CommentModel cm){
        cs.remove(cm);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody CommentModel cm){
        cs.modify(cm);
    }

    @RequestMapping("/getListByArticle")
    public PageInfo<CommentModel> getListByArticle(int pageNo, int pageSize, int aid){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(cs.getListByArticle(aid));
    }

    @RequestMapping("/getListByUser")
    public PageInfo<CommentModel> getListByUsername(int pageNo, int pageSize, String username){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(cs.getListByUser(username));
    }
}
