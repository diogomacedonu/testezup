package com.orangetalents.zup.contoller.helper;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String email;
    private String cpf;
    private Date birthdate;
    private String password;

    public UserRequest(String name, String email, String cpf, Date birthdate, String password) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.password = password;
    }
}
