//package com.javaback.project.minichat.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;

//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
//public class SecurityConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.builder()
//                .username("user")
//                .password(bCryptPasswordEncoder.encode("userPass"))
//                .roles("USER")
//                .build());
//        manager.createUser(User.builder()
//                .username("admin")
//                .password(bCryptPasswordEncoder.encode("adminPass"))
//                .roles("ADMIN") // Corrected roles to properly align with Spring Security's role expectations
//                .build());
//        return manager;
//    }
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers("/login/**").permitAll()
//                        .anyRequest().authenticated())
//                .httpBasic(httpBasicCustomizer -> httpBasicCustomizer.realmName("MiniChatApp"))
//                .csrf(csrf -> csrf.disable()) // Correct way to disable CSRF as per new API
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//        return http.build();
//    }
//}




//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/login/**").permitAll()  // Allow everyone to access /login
//                        .requestMatchers("/admin/**").hasAuthority("ROLE_ADMIN")  // Only users with ROLE_ADMIN can access /admin
//                        .requestMatchers("/user/**").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")  // Both ROLE_USER and ROLE_ADMIN can access /user
//                        .anyRequest().authenticated())  // All other requests require authentication
//                .httpBasic(httpBasicCustomizer -> httpBasicCustomizer.realmName("MiniChatApp"))  // Configure HTTP basic authentication
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  // Use stateless session; session won't be used to store user's state.
//
//        return http.build();
//    }
//}
