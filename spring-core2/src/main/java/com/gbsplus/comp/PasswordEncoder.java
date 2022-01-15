package com.gbsplus.comp;

import org.springframework.stereotype.Component;

// @Component
public class PasswordEncoder {

    public String encode(String password) {
        return password.toUpperCase();

    }

    public String decode(String password) {
        return password.toLowerCase();
    }

}
