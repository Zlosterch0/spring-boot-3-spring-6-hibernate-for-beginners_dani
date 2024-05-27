package com.luv2code.springboot.demo.mycoolapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

//  @Bean
//  public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//
//    UserDetails john =
//        User.builder().username("john").password("{noop}123").roles("STUDENT").build();
//
//    UserDetails dimcho =
//        User.builder().username("dimcho").password("{noop}123").roles("ADMIN","STUDENT").build();
//    return new InMemoryUserDetailsManager(john, dimcho);
//  }
//
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http.authorizeHttpRequests(
//        configurer ->
//            configurer
//                .requestMatchers(HttpMethod.GET, "/students/")
//                .hasRole("STUDENT")
//                .requestMatchers(HttpMethod.GET, "/students/**")
//                .hasRole("STUDENT")
//                .requestMatchers(HttpMethod.POST, "/students/")
//                .hasRole("ADMIN")
//                .requestMatchers(HttpMethod.PUT, "/students/")
//                .hasRole("ADMIN")
//                .requestMatchers(HttpMethod.DELETE, "/students/**")
//                .hasRole("ADMIN"));
//    http.httpBasic(Customizer.withDefaults());
//
//    http.csrf(csrf -> csrf.disable());
//    return http.build();
//  }
}
