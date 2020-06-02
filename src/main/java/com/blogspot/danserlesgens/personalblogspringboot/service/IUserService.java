package com.blogspot.danserlesgens.personalblogspringboot.service;

import com.blogspot.danserlesgens.personalblogspringboot.model.UserModel;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface IUserService extends UserDetailsService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    void add(UserModel um);
    void modify(UserModel um);
    void remove(UserModel um);
    UserModel getUserByUsername(String username);
    List<UserModel> getListBySearchText(String searchText);
}
