//package com.jurumin.springboot_developer.config;
//
//import com.jurumin.springboot_developer.service.UserDetailService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
//
//@RequiredArgsConstructor
//@Configuration
//public class WebSecurityConfig {
//
//    private final UserDetailService userService;
//
//    @Bean
//    public WebSecurityCustomizer configure(){
//        return (web -> web.ignoring()
//                .requestMatchers(toH2Console())
//                .requestMatchers("/static /**"));
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/login", "/signup", "/user").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/login")
//                        .defaultSuccessUrl("/articles", true)
//                )
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/login")
//                        .invalidateHttpSession(true)
//                );
//
//        return http.build();
//    }
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(
//            AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//}
