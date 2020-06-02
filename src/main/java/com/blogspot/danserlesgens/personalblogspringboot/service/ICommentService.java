package com.blogspot.danserlesgens.personalblogspringboot.service;

import com.blogspot.danserlesgens.personalblogspringboot.model.CommentModel;

import java.util.List;

public interface ICommentService {
    void add(CommentModel cm);
    void remove(CommentModel cm);
    void modify(CommentModel cm);
    List<CommentModel> getListByArticle(int aid);
    List<CommentModel> getListByUser(String username);
}
