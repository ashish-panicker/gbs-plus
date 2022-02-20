package com.gbs.plus.springbootapp2.viewmodels;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserViewModel {
    
    private Long id;

    private String userName;

    private String password;

    private LocalDate createdDate;

    private boolean enabled;

}
