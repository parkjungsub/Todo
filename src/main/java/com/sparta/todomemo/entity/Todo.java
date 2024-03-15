package com.sparta.todomemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.grammars.hql.HqlParser;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Getter @Setter
public class Todo {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
//    @Column
//    @ManyToOne
//    private User user;

    public Todo(String name, String title, String content){
        this.name = name;
        this.title = title;
        this.content = content;
    }
    public Todo(){

    }
}
