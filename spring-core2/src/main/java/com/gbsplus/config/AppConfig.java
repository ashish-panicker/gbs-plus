package com.gbsplus.config;

import com.gbsplus.comp.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.gbsplus", "com.gbsplus.repo", "com.gbsplus.service"})
public class AppConfig {

    @Bean
    @Scope("singleton")
    public PasswordEncoder passwordEncoder() {
        return new PasswordEncoder();
    }
}
