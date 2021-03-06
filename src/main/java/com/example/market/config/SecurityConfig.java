package com.example.market.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("director").password(passwordEncoder().encode("director")).roles("DIRECTOR")
                .and()
                .withUser("manager").password(passwordEncoder().encode("manager")).roles("MANAGER")
              .and()
                .withUser("user").password(passwordEncoder().encode("user")).roles("USER");





    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {




        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/**").hasAnyRole("DIRECTOR")
                .antMatchers(HttpMethod.GET,"api/**").hasRole("USER")
                .antMatchers(HttpMethod.GET,"api/**").hasRole("MANAGER")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }
@Bean
    PasswordEncoder passwordEncoder(){
return new BCryptPasswordEncoder();
    }
}
