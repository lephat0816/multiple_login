package com.example.multipleLogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.example.multipleLogin.service.CustomUserDetailService;

@Configuration
@Order(1)
public class AdminSecurityConfig {
    @Bean
    public UserDetailsService userDetailService() {
        return new CustomUserDetailService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain filterChain1(HttpSecurity http) throws Exception {
        http.securityMatcher("/admin/**")
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin/**").hasAuthority("ADMIN")
            )
            .formLogin(form -> form
                .loginPage("/admin/login")
                .usernameParameter("email")
                .loginProcessingUrl("/admin/login")
                .defaultSuccessUrl("/admin/home",true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/admin/logout")
                .logoutSuccessUrl("/")
            );


        return http.build();
    }
}
