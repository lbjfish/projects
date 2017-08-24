package com.bingobox.user.dao;

import java.util.List;

import com.bingobox.user.po.UserSystemRef;

public interface UserSystemRefMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserSystemRef record);

    UserSystemRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserSystemRef record);

    List<Long>  selectSysIdListByUserId(Long userId);
}