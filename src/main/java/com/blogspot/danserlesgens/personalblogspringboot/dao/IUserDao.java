package com.blogspot.danserlesgens.personalblogspringboot.dao;

import com.blogspot.danserlesgens.personalblogspringboot.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IUserDao {
    void insert(UserModel um);
    void update(UserModel um);
    void delete(UserModel um);
    List<UserModel> selectListBySearchText(@Param("searchText") String searchText);
    UserModel selectUserByUsername(@Param("username") String username);
}
