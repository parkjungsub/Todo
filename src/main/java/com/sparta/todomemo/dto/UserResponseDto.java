package com.sparta.todomemo.dto;

import com.sparta.todomemo.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Builder
public class UserResponseDto {
    private Long id;
    private String username;

    public UserResponseDto(Long id, String username){
        this.id = id;
        this.username = username;
    }

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }

//    public static UserResponseDto of(User user){
//        return UserResponseDto.builder()
//                .id(user.getId())
//                .username(user.getUsername())
//                .build();
//    }
}
