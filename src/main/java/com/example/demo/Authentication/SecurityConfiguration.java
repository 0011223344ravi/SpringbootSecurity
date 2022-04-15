package com.example.demo.Authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		super.configure(auth);
		auth.inMemoryAuthentication()
		.withUser("USER")
		.password("USER")
		.roles("USER");
	}
   @Bean
   public PasswordEncoder getPasswordEncoder() {
	   return NoOpPasswordEncoder.getInstance();
   }

  
  
}
