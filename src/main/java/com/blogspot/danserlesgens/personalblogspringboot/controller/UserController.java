package com.blogspot.danserlesgens.personalblogspringboot.controller;

import com.blogspot.danserlesgens.personalblogspringboot.model.ArticleModel;
import com.blogspot.danserlesgens.personalblogspringboot.model.AuthenticationRequest;
import com.blogspot.danserlesgens.personalblogspringboot.model.AuthenticationResponse;
import com.blogspot.danserlesgens.personalblogspringboot.model.UserModel;
import com.blogspot.danserlesgens.personalblogspringboot.service.IUserService;
import com.blogspot.danserlesgens.personalblogspringboot.service.impl.UserServiceImpl;
import com.blogspot.danserlesgens.personalblogspringboot.util.JwtUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    private AuthenticationManager authenticationManager;

    private IUserService us;

    private JwtUtil jwtTokenUtil;

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Autowired
    public void setUs(IUserService us) {
        this.us = us;
    }


    @Autowired
    public void setJwtTokenUtil(JwtUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @RequestMapping("/add")
    public void add(@RequestBody UserModel um){
        us.add(um);
    }

    @RequestMapping("/modify")
    public void modify(@RequestBody UserModel um){
        us.modify(um);
    }

    @RequestMapping("/remove")
    public void remove(@RequestBody UserModel um){
        us.remove(um);
    }

    @RequestMapping("/getListBySearchText")
    public PageInfo<UserModel> getListBySearchText(int pageNo, int pageSize, String searchText){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(us.getListBySearchText(searchText));
    }

    @RequestMapping("/getUserByUsername")
    public UserModel getUserByUsername(String username){
        return us.getUserByUsername(username);
    }

    @RequestMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e){
            throw new Exception("用户名或密码错误",e);
        }

        final UserDetails userDetails = us.loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
