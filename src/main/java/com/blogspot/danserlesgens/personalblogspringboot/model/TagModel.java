package com.blogspot.danserlesgens.personalblogspringboot.model;

import org.apache.ibatis.type.Alias;

@Alias("Tag")
public class TagModel {
    private Integer id;
    private String tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "TagModel{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                '}';
    }
}
