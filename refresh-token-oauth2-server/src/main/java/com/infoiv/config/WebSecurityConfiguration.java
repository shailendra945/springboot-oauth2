package com.infoiv.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http
                .authorizeRequests()
                .anyRequest().authenticated().and()
                .antMatcher("/user/**")
                .httpBasic()
                .and()
                .csrf().disable();
    }

}
