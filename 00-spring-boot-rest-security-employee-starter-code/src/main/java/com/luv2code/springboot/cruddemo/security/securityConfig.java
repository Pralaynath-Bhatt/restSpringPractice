package com.luv2code.springboot.cruddemo.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails raj = User.builder()
                .username("raj")
                .password("{noop}raj")
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

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer->
                configurer
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN"));
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf-> csrf.disable());
        return http.build();
    }
}
