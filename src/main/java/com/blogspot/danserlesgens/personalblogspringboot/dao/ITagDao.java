package com.blogspot.danserlesgens.personalblogspringboot.dao;

import com.blogspot.danserlesgens.personalblogspringboot.model.TagModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ITagDao {
    void insert(TagModel tm);
    void insertTags(@Param("aid") int aid, @Param("tms") List<TagModel> tms);
    void update(TagModel tm);
    void delete(TagModel tm);

    //根据标签名查找标签
    int selectIdByName(String tagName);
    //根据文章查找标签
    List<TagModel> selectListByArticle(int aid);
    //得到所有的标签
    List<TagModel> selectListByAll();

    int isExist(TagModel tm);
    int isRelationExist(@Param("aid") int aid,@Param("tid")  int tid);
}
