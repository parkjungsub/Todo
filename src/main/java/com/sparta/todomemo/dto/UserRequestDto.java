package com.sparta.todomemo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserRequestDto {
    private Long id;
    private String username;
    private String password;
}
