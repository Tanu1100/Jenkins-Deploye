package com.secure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@EnableWebSecurity
@Configuration
public class SecureConfig extends WebSecurityConfigurerAdapter{
	
	
	//in-Memory
	
	/*
	 * protected void configure(AuthenticationManagerBuilder auth) throws Exception
	 * { auth.inMemoryAuthentication()
	 * .withUser("naya").password("naya").authorities("admin").and()
	 * .withUser("tanu11").password("tanu11").authorities("read").and()
	 * .passwordEncoder(NoOpPasswordEncoder.getInstance()); }
	 */
	
	//Custom security
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/b").authenticated()
		.antMatchers("/c").authenticated()
		.antMatchers("/h").permitAll().antMatchers("/d").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	
}
