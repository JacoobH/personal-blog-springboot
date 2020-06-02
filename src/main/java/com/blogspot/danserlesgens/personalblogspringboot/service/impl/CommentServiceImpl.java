package com.blogspot.danserlesgens.personalblogspringboot.service.impl;

import com.blogspot.danserlesgens.personalblogspringboot.dao.ICommentDao;
import com.blogspot.danserlesgens.personalblogspringboot.model.CommentModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("commentService")
@Transactional
public class CommentServiceImpl implements ICommentService {

    private ICommentDao cd;

    @Autowired
    public void setCd(ICommentDao cd) {
        this.cd = cd;
    }

    @Override
    public void add(CommentModel cm) {
        cd.insert(cm);
    }

    @Override
    public void remove(CommentModel cm) {
        cd.delete(cm);
    }

    @Override
    public void modify(CommentModel cm) {
        cd.update(cm);
    }

    @Override
    public List<CommentModel> getListByArticle(int aid) {
        return cd.selectListByArticle(aid);
    }

    @Override
    public List<CommentModel> getListByUser(String username) {
        return cd.selectListByUser(username);
    }
}
