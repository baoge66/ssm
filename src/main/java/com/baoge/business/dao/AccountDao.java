package com.baoge.business.dao;

import com.baoge.business.entity.Account;

public interface AccountDao {

    int deleteByPrimaryKey(String username);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}