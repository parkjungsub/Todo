package com.sparta.todomemo.controller;

import com.sparta.todomemo.dto.TodoRequestDto;
import com.sparta.todomemo.dto.TodoResponseDto;
import com.sparta.todomemo.entity.Todo;
import com.sparta.todomemo.repository.TodoRepository;
import com.sparta.todomemo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public ResponseEntity<Void> upload(@RequestBody TodoRequestDto todoRequestDto){
        todoService.postUpload(todoRequestDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<TodoResponseDto> getTodo(@PathVariable Long id){
        TodoResponseDto todoResponseDto = todoService.TodoFind(id);

        return ResponseEntity.ok().body(todoResponseDto);
    }

    @DeleteMapping("/todo/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        todoService.TodoDelete(id);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/todo/update")
    public ResponseEntity<TodoRequestDto> update(@RequestBody TodoRequestDto todoRequestDto){
        todoService.todoUpdata(todoRequestDto);

        return ResponseEntity.ok().body(todoRequestDto);
    }
}
