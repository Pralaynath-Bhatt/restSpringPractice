package com.spring.aop;

import com.spring.aop.dao.AccountDAO;
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
			addAccountDemo(accountDAO);
		};
	}

	private void addAccountDemo(AccountDAO accountDAO) {
		System.out.println(getClass() + " Inside Main");
		accountDAO.addAccount(true);

	}
}
