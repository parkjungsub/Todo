package com.sparta.todomemo.service;

import com.sparta.todomemo.dto.TodoRequestDto;
import com.sparta.todomemo.dto.TodoResponseDto;
import com.sparta.todomemo.dto.UserResponseDto;
import com.sparta.todomemo.entity.Todo;
import com.sparta.todomemo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TodoService {
    private final TodoRepository todoRepository;

    public void postUpload(TodoRequestDto todoRequestDto){
        Todo todo = new Todo(
                todoRequestDto.getName(),
                todoRequestDto.getTitle(),
                todoRequestDto.getContent());
        todoRepository.save(todo);
    }

    public TodoResponseDto TodoFind(Long id){
        Optional<Todo> todo = todoRepository.findById(id);
         TodoResponseDto responseDto = new TodoResponseDto(
                 todo.get().getName(),
                 todo.get().getTitle(),
                 todo.get().getContent(),
                 todo.get().getLocalDateTime()
        );
         return responseDto;
    }

    public void TodoDelete(Long id){
        Optional<Todo> todo = todoRepository.findById(id);
        todoRepository.delete(todo.get());
    }

    public TodoResponseDto todoUpdata(TodoRequestDto todoRequestDto){
        Optional<Todo> todo = todoRepository.findById(todoRequestDto.getId());
        todo.get().setName(todoRequestDto.getName());
        todo.get().setTitle(todoRequestDto.getTitle());
        todo.get().setContent(todoRequestDto.getContent());

        TodoResponseDto todoResponseDto = new TodoResponseDto(
                todo.get().getName(),
                todo.get().getTitle(),
                todo.get().getContent(),
                todo.get().getLocalDateTime()
        );

        return todoResponseDto;
    }
}
