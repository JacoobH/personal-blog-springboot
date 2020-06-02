package com.blogspot.danserlesgens.personalblogspringboot.model;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class UserModel {
    private String username;
    private String password;
    private String permission;
    private String photoPath;
    private String photoFileName;
    private String photoContentType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permission='" + permission + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", photoFileName='" + photoFileName + '\'' +
                ", photoContentType='" + photoContentType + '\'' +
                '}';
    }
}
