package com.spring.aop.dao;

import com.spring.aop.entity.Account;

import java.util.List;

public interface AccountDAO {

    Account addAccount(Account account, boolean row);

    List<Account> findAccount(boolean tripwire);
}
