package com.analyzer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().permitAll()  // Permite que todos acessem todas as rotas
                )
                .csrf(csrf -> csrf.disable())  // Desabilita proteção CSRF para simplificação (se necessário)
                .formLogin().disable()  // Desativa a página de login
                .httpBasic().disable();  // Desativa a autenticação básica HTTP (se habilitada)

        return http.build();
    }
}
