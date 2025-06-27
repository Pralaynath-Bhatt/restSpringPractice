package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class securityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails raj = User.builder()
                .username("raj")
                .password("{noop}rajbhaiop")
                .roles("EMPLOYEE")
                .build();

        UserDetails rakshi = User.builder()
                .username("rakshi")
                .password("{noop}rakshi")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails sonia = User.builder()
                .username("sonia")
                .password("{noop}sonia")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(raj,rakshi,sonia);
    }
}
