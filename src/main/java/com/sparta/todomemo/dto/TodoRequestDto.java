package com.sparta.todomemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class TodoRequestDto {
    private Long id;
    private String name;
    private String title;
    private String content;
    private LocalDateTime localDateTime;
}
