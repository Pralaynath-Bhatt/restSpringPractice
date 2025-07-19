package com.spring.aop.dao;

import com.spring.aop.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public Account addAccount(Account account, boolean raw) {
        System.out.println(getClass() + "Inside DAO IMPLI");
        return account;
    }

    @Override
    public List<Account> findAccount(boolean tripwire) {
        if(tripwire){
            throw new RuntimeException("Error hai bhai mai huh dao se");
        }
        Account account1 = new Account("Pranjal","pb","1234");
        Account account2 = new Account("Pran","p","124");
        Account account3 = new Account("jal","b","123");
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        return accountList;
    }

}
