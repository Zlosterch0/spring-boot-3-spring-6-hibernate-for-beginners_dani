package com.luv2code.springboot.demo.mycoolapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SQLSescurityConfiguration {

  @Bean
  public UserDetailsManager userDetailsManager(DataSource dataSource) {

    return new JdbcUserDetailsManager(dataSource);
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
        configurer ->
            configurer
                .requestMatchers(HttpMethod.GET, "/students/")
                .hasRole("STUDENT")
                .requestMatchers(HttpMethod.GET, "/students/**")
                .hasRole("STUDENT")
                .requestMatchers(HttpMethod.POST, "/students/")
                .hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/students/")
                .hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/students/**")
                .hasRole("ADMIN"));
    http.httpBasic(Customizer.withDefaults());

    http.csrf(csrf -> csrf.disable());
    return http.build();
  }
}
