package com.dogway.bwscout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

@Configuration
@EnableWebSecurity
public class ZKSecurityConfig extends WebSecurityConfigurerAdapter {

	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http.sessionManagement().sessionFixation().none();
	// http.authorizeRequests()
	// .antMatchers(
	// "/zkau*", // <--- for zk ajax (internal)
	// "/login*", "/logout", // <--- for login/logout
	// "/js/**", // <--- static resources...
	// "/css/**",
	// "/bootstrap/**",
	// "/img/**",
	// "/static/**"
	// )
	// .permitAll().anyRequest().authenticated().and()
	// .headers().frameOptions().disable().and()
	// //.formLogin().permitAll().defaultSuccessUrl("/testVM.zul", true).and()
	// // this redirect allways to testVM.zul page
	// .formLogin().permitAll().defaultSuccessUrl("/schedule.zul", true).and()
	// .logout().permitAll().and()
	// .csrf().disable();
	// }

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		// testing login user uuu / ppp
//		auth.inMemoryAuthentication().withUser("uuu").password("ppp").roles("USER");
//	}

	// =======================================================================
	@Autowired
	private OAuth2RestTemplate restTemplate;

	@Bean
	public OpenIdConnectFilter openIdConnectFilter() {
		OpenIdConnectFilter filter = new OpenIdConnectFilter("/google-login");
		filter.setRestTemplate(restTemplate);
		//This success handler gives us our default page on successful login.
		filter.setAuthenticationSuccessHandler(new SimpleUrlAuthenticationSuccessHandler() {
		    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		        this.setDefaultTargetUrl("/schedule.zul");
		        super.onAuthenticationSuccess(request, response, authentication);
		    }
		});
		return filter;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterAfter(new OAuth2ClientContextFilter(), AbstractPreAuthenticatedProcessingFilter.class)
				.addFilterAfter(openIdConnectFilter(), OAuth2ClientContextFilter.class).httpBasic()
				.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/google-login")).and()
				.authorizeRequests().anyRequest().authenticated();
	}
}
