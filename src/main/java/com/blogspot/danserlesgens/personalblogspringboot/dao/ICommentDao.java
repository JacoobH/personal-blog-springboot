package com.blogspot.danserlesgens.personalblogspringboot.dao;

import com.blogspot.danserlesgens.personalblogspringboot.model.CommentModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ICommentDao {
    void insert(CommentModel cm);
    void update(CommentModel cm);
    void delete(CommentModel cm);
    List<CommentModel> selectListByArticle(@Param("aid") int aid);
    List<CommentModel> selectListByUser(@Param("username") String username);
}
