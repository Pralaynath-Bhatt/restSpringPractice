package com.spring.aop;

import com.spring.aop.dao.AccountDAO;
import com.spring.aop.entity.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO){
		return runner ->{
			//Account account =  addAccountDemo(accountDAO);
			myTHeThrowerrorPart(accountDAO);
		};
	}

	private void myTHeThrowerrorPart(AccountDAO accountDAO) {
		try{
			boolean tripwire=true;
			List<Account> accountList= accountDAO.findAccount(tripwire);
		}
		catch (Exception exp){
			System.out.println("IN main Got expetion: "+exp);
		}
	}

	private Account addAccountDemo(AccountDAO accountDAO) {
		System.out.println(getClass() + " Inside Main");

		Account account = new Account("pranjal","pranjalbhatt@gmail.com","12345678");
		accountDAO.addAccount(account,true);
		System.out.println(account.toString()+"   =======>>>in main");
		return account;

	}
}
