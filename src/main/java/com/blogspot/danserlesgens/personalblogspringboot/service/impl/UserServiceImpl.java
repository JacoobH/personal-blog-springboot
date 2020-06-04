package com.blogspot.danserlesgens.personalblogspringboot.service.impl;

import com.blogspot.danserlesgens.personalblogspringboot.dao.IUserDao;
import com.blogspot.danserlesgens.personalblogspringboot.model.UserModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {
    private IUserDao ud;

    @Autowired
    public void setUd(IUserDao ud) {
        this.ud = ud;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel um = ud.selectUserByUsername(username);
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("admin"));
//        authorities.add(new SimpleGrantedAuthority("guest"));
        return new User(um.getUsername(),um.getPassword(),new ArrayList<>());
    }

    @Override
    public void add(UserModel um) {
        boolean flag = false;
        List<UserModel> list = getListBySearchText(null);
        for(UserModel user : list)    {
            if (user.getUsername().equals(um.getUsername())){
                flag = true;
            }
        }
        if (!flag) {
            ud.insert(um);
        }
    }

    @Override
    public void modify(UserModel um) {
        ud.update(um);
    }

    @Override
    public void remove(UserModel um) {
        ud.delete(um);
    }

    @Override
    public UserModel getUserByUsername(String username) {
        return ud.selectUserByUsername(username);
    }

    @Override
    public List<UserModel> getListBySearchText(String searchText) {
        return ud.selectListBySearchText(searchText);
    }
}
