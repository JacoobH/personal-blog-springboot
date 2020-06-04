package com.blogspot.danserlesgens.personalblogspringboot.service;

import com.blogspot.danserlesgens.personalblogspringboot.model.TagModel;

import java.util.List;

public interface ITagService {
    void add(TagModel tm);
    void addTags(int aid, List<TagModel> tms);
    void remove(TagModel tm);
    void removeTags(int aid, List<TagModel> aTms);
    void modify(TagModel tm);

    int getIdByName(String tagName);
    List<TagModel> getListByArticle(int aid);
    List<TagModel> getListByAll();

    boolean isExist(TagModel tm);
    boolean isRelationExist(int aid, int tid);
}
