package com.sparta.todomemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
@Setter @Getter
public class User {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
//    @Column
//    @OneToMany(mappedBy = "user")
//    private List<Todo> todoList = new ArrayList<>();

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User() {

    }

}
