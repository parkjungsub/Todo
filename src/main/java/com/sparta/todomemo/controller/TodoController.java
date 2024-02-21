package com.sparta.todomemo.controller;

import com.sparta.todomemo.dto.TodoRequestDto;
import com.sparta.todomemo.dto.TodoResponseDto;
import com.sparta.todomemo.dto.UserRequestDto;
import com.sparta.todomemo.dto.UserResponseDto;
import com.sparta.todomemo.service.TodoService;
import com.sparta.todomemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class TodoController {

    private final UserService userService;
    private final TodoService todoService;

    @PostMapping("/user/signup")
    public ResponseEntity<Void> signup(@RequestBody UserRequestDto userRequestDto){
        userService.join(userRequestDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponseDto> getProfile(@PathVariable Long id){
        UserResponseDto userResponseDto = userService.Userfind(id);
        return ResponseEntity.ok().body(userResponseDto);
    }

}