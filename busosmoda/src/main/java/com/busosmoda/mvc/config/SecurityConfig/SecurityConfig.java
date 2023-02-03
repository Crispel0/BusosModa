package com.busosmoda.mvc.config.SecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override /** configure the authoentication of users - configuracion de autoentificacion de usuarios*/
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
	}
	
	@Override /*protect the URLS access - onfiguration de control de acceso*/
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/home").permitAll().
		antMatchers(HttpMethod.GET,"/home/*").permitAll();
			
	}
	
	@Override /* Conifguration for all the fields estaticos - configuracion para los archivos estaticos (js ccs img)*/
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}
	
}

