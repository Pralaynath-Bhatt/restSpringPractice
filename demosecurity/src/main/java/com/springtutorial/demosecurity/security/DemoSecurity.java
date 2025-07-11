package com.springtutorial.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurity {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails raj = User.builder()
                .username("raj")
                .password("{noop}raj")
                .roles("EMPLOYEE").build();
        UserDetails raskhi = User.builder()
                .username("rakshi")
                .password("{noop}rakshi")
                .roles("EMPLOYEE","MANAGER").build();
        UserDetails sonia = User.builder()
                .username("sonia")
                .password("{noop}sonia")
                .roles("EMPLOYEE","MANAGER","ADMIN").build();
        return new InMemoryUserDetailsManager(raj,raskhi,sonia);
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    http.authorizeHttpRequests(configerer->configerer
            .anyRequest().authenticated()
    )
            .formLogin(form ->form
                    .loginPage("/showLoginPage")
                    .loginProcessingUrl("/authenticateTheUser")
                    .permitAll()
            )
            .logout(logout ->logout.permitAll()
            );
    ;
    return http.build();
    }
}