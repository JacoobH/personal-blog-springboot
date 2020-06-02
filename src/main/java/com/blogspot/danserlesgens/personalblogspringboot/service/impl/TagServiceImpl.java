package com.blogspot.danserlesgens.personalblogspringboot.service.impl;

import com.blogspot.danserlesgens.personalblogspringboot.dao.ITagDao;
import com.blogspot.danserlesgens.personalblogspringboot.model.TagModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service("tagService")
@Transactional
public class TagServiceImpl implements ITagService {

    private ITagDao td;

    @Autowired
    public void setTd(ITagDao td) {
        this.td = td;
    }


    @Override
    public void add(TagModel tm) {
        td.insert(tm);
    }

    @Override
    public void addTags(int aid, List<TagModel> tms) {
//        System.out.println(tms);
        //如果标签不存在则添加标签
        List<TagModel> existedTags = new ArrayList<>();
        for(TagModel tm : tms){
            if (!isExist(tm)){
                add(tm);
            }
            else {
                tm.setId(getIdByName(tm.getTag()));
//                System.out.println(tm.getId());
                if (isRelationExist(aid,tm.getId())){
//                    tms.remove(tm);
                    existedTags.add(tm);
                }
            }
        }
        tms.removeAll(existedTags);
        if (!tms.isEmpty()){
//            System.out.println(tms);
            td.insertTags(aid,tms);
        }

    }

    @Override
    public void remove(TagModel tm) {
        td.delete(tm);
    }

    @Override
    public void modify(TagModel tm) {
        td.update(tm);
    }

    @Override
    public int getIdByName(String tagName) {
        return td.selectIdByName(tagName);
    }

    @Override
    public List<TagModel> getListByArticle(int aid) {
        return td.selectListByArticle(aid);
    }

    @Override
    public List<TagModel> getListByAll() {
        return td.selectListByAll();
    }
    @Override
    public boolean isExist(TagModel tm) {
        return td.isExist(tm) > 0;
    }

    @Override
    public boolean isRelationExist(int aid, int tid) {
        return td.isRelationExist(aid,tid) > 0;
    }
}
