package com.orangetalents.zup.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    private Date birthdate;

    @JsonIgnore
    @Column(name = "user_password")
    private String password;

    public User(String name, String email, String cpf, Date birthdate, String password) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.password = password;
    }

    public User(Long id, String name, String email, String cpf, Date birthdate, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.password = password;
    }

    public User() {
    }
}
