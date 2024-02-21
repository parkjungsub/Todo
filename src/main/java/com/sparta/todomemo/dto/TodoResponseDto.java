package com.sparta.todomemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class TodoResponseDto {
    private Long id;
    private String name;
    private String title;
    private String content;
    private LocalDateTime localDateTime;

    public TodoResponseDto(String name, String title, String content, LocalDateTime localDateTime) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.localDateTime = localDateTime;
    }
}
