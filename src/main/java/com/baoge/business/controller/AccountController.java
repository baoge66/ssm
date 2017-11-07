package com.baoge.business.controller;

import com.baoge.business.entity.Account;
import com.baoge.business.service.AccountService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by P0105144 on 2017/10/25.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Resource
    private AccountService accountService;

    @RequestMapping("/login")
    public String index (Account account){
        accountService.insert(account);
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
       return sqlSessionTemplate.selectOne("com.baoge.business.dao.AccountDao.selectByPrimaryKey","admin");
    }

}
