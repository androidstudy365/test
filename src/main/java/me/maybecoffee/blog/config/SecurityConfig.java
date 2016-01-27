package me.maybecoffee.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("admin1").password("admin1").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("admin2").password("admin2").roles("ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
		http.httpBasic();

		http.authorizeRequests()
			//.antMatchers(HttpMethod.GET, "/categories/**").permitAll()
			//.antMatchers(HttpMethod.GET, "/blogposts/**").permitAll()
			.anyRequest().hasRole("ADMIN");
			//.anyRequest().permitAll();
			//.and().apply(new SpringSocialConfigurer());
		
	}
}
