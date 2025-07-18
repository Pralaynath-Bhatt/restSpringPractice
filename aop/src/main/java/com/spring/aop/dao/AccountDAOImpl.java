package com.spring.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(boolean raw) {
        System.out.println(getClass() + "Inside DAO IMPLI");
    }

}
