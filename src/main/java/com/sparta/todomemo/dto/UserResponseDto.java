package com.sparta.todomemo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserResponseDto {
    private Long id;
    private String username;

    public UserResponseDto(Long id, String username){
        this.id = id;
        this.username = username;
    }
}
