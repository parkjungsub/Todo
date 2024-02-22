package com.sparta.todomemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Comment {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String content;
}
