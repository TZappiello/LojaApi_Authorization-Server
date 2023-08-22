package com.lojaapi.auth.core;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
//	@Override  	USANDO ESSE METODO PARA TESTE COM USUARIO FIXO
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.inMemoryAuthentication()
//			.withUser("thiago")
//			.password(passwordEncoder().encode("123"))
//			.roles("ADMIN")
//		.and()
//			.withUser("joao")
//			.password(passwordEncoder().encode("123"))
//			.roles("ADMIN");
//		
//	}

    @Bean
    PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
    
    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
    	return super.authenticationManager();
    }
    
//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//    	return super.userDetailsService();
//    }
}
