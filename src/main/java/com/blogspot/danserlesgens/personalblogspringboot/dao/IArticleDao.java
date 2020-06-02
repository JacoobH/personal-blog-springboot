package com.blogspot.danserlesgens.personalblogspringboot.dao;

import com.blogspot.danserlesgens.personalblogspringboot.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface IArticleDao {
    int insert(ArticleModel am);
    void update(ArticleModel am);
    void delete(ArticleModel am);
    List<ArticleModel> selectListBySearchText(@Param("searchText") String searchText);
    ArticleModel selectArticleById(int id);
}
