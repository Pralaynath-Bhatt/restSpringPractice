package com.spring.aop;

import com.spring.aop.dao.AccountDAO;
import com.spring.aop.entity.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO){
		return runner ->{
			Account account =  addAccountDemo(accountDAO);
		};
	}

	private Account addAccountDemo(AccountDAO accountDAO) {
		System.out.println(getClass() + " Inside Main");

		Account account = new Account("pranjal","pranjalbhatt@gmail.com","12345678");
		accountDAO.addAccount(account,true);
		System.out.println(account.toString()+"   =======>>>in main");
		return account;

	}
}
