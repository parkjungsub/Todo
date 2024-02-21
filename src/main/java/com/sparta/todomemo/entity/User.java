package com.sparta.todomemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@Setter @Getter
public class User {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User() {

    }
}
