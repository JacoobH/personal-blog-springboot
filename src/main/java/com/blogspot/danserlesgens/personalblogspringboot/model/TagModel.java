package com.blogspot.danserlesgens.personalblogspringboot.model;

import org.apache.ibatis.type.Alias;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagModel tagModel = (TagModel) o;
        return Objects.equals(id, tagModel.id) &&
                Objects.equals(tag, tagModel.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tag);
    }
}
