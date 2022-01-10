package com.securerestservice.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.azure.spring.aad.webapi.AADResourceServerWebSecurityConfigurerAdapter;


/*
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	

    @Override
    protected void configure(HttpSecurity http) throws Exception {

    	//super.configure(http);
        //http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
    	//http.authorizeRequests().antMatchers("/api/**").authenticated();
    	http.cors().and()
        .authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .oauth2ResourceServer()
        .jwt();
    }
}

*/

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends AADResourceServerWebSecurityConfigurerAdapter {
    /**
     * Add configuration logic as needed.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.cors().and()
        .authorizeRequests((requests) -> requests.anyRequest().authenticated());
    }
}