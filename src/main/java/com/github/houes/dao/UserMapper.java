package com.github.houes.dao;

import com.github.houes.pojo.SysUser;

import java.util.List;

public interface UserMapper {

    List<SysUser> getUser();

    List<SysUser> getUserList();
}
