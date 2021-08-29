package org.dmsv.challengetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //    @Autowired
//    DataSource dataSource;
//
//    //Enable jdbc authentication
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSource);
//    }
    @Autowired
    RestAuthEntryPoint restAuthEntryPoint;


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/",
                        "/favicon.ico",
                        "/**/*.png",
                        "/**/*.gif",
                        "/**/*.svg",
                        "/**/*.jpg",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/**/*.json",
                        "/**/*.txt"
                            ).permitAll()
                .antMatchers("/api/**", "/login2").permitAll()
                .antMatchers("/challenges/**").hasRole("USER")
                .anyRequest()
                .authenticated()
                .and()
//                .exceptionHandling()
//                .authenticationEntryPoint(restAuthEntryPoint)
//                .and()
                .formLogin()
                .loginPage("/login2");
//
//                .and()
//                .exceptionHandling()
//                .authenticationEntryPoint(restAuthEntryPoint)
//                .and()
//                .formLogin()

//                .loginProcessingUrl("/login2");
//                .defaultSuccessUrl("/homepage.html", true)
//                .failureUrl("/login.html?error=true")
////                .failureHandler(authenticationFailureHandler())
//                .and()
//                .logout()
//                .logoutUrl("/perform_logout")
//                .deleteCookies("JSESSIONID");
//                .logoutSuccessHandler(logoutSuccessHandler());;
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.builder()
                        .username("user")
                        .password("{noop}password")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}