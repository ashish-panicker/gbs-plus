package com.gbsplus;

import com.gbsplus.comp.PasswordEncoder;
import com.gbsplus.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    private PasswordEncoder passwordEncoder;

    public App() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        passwordEncoder = context.getBean(PasswordEncoder.class);
    }

    public void passwordEncoderEncode() {
        System.out.println(passwordEncoder.encode("password"));
    }

    public static void main(String[] args) {
        
        App app = new App();
        app.passwordEncoderEncode();
    }
}
