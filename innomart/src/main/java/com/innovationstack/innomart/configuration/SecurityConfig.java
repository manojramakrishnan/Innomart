package com.innovationstack.innomart.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Value("${jpa.usercheck.query}")
	private String checkUsers;

	@Value("${jpa.rolecheck.query}")
	private String checkRoles;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.
                jdbcAuthentication()
                .usersByUsernameQuery(checkUsers)
                .authoritiesByUsernameQuery(checkRoles)
                .dataSource(dataSource)
                .passwordEncoder(encoder);
    }

	@Override
    protected void configure(HttpSecurity http) throws Exception {

        http.
                authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/api/**").permitAll()
                .antMatchers("/list").permitAll()
                
                .antMatchers("/login").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/logout").permitAll()
                .antMatchers("/delete").permitAll()
                
                .antMatchers("/index").permitAll()
                .antMatchers("/country").permitAll()
                .antMatchers("/district").permitAll()
                .antMatchers("/pharmacist/**").permitAll()
                .antMatchers("/patient/**").permitAll()
                .antMatchers("/admin/**").permitAll()
                .antMatchers("/receptionist/**").permitAll()
                .antMatchers("/h2-console").permitAll()
                .antMatchers("/AYURMEDMEDICINEAPISERVICE/**").permitAll()
                .antMatchers("/AYURMEDPATIENTSERVICE/**").hasAuthority("AYURMEDPATIENTSERVICE").anyRequest()
                .authenticated().and().csrf().disable().formLogin()
                .loginPage("/login").failureUrl("/login?error=true")
                .defaultSuccessUrl("/user/home",true)
                .usernameParameter("email")
                .passwordParameter("password")
                .and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/").and().exceptionHandling()
                .accessDeniedPage("/access-denied");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/fonts/**", "/bootstrap/**", "/js/**", "/images/**");
    }
}
