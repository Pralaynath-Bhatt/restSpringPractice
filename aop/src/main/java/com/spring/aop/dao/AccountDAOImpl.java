package com.spring.aop.dao;

import com.spring.aop.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public Account addAccount(Account account, boolean raw) {
        System.out.println(getClass() + "Inside DAO IMPLI");
        return account;
    }

}
