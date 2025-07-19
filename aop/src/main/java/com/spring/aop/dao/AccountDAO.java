package com.spring.aop.dao;

import com.spring.aop.entity.Account;

public interface AccountDAO {

    Account addAccount(Account account, boolean row);

}
