package com.baoge.business.service.impl;

import com.baoge.business.dao.AccountDao;
import com.baoge.business.entity.Account;
import com.baoge.business.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by P0105144 on 2017/10/26.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public int insert(Account account) {
        return accountDao.insert(account);
    }
}
