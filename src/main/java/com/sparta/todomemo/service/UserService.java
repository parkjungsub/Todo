package com.sparta.todomemo.service;

import com.sparta.todomemo.dto.UserRequestDto;
import com.sparta.todomemo.dto.UserResponseDto;
import com.sparta.todomemo.entity.User;
import com.sparta.todomemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto join(UserRequestDto userRequestDto){
        User user = userRepository.save(new User(userRequestDto.getUsername(), userRequestDto.getPassword()));
        UserResponseDto userResponseDto = new UserResponseDto(user);

        return userResponseDto;
    }

    public UserResponseDto Userfind(Long id){
        Optional<User> user = userRepository.findById(id);
        UserResponseDto userResponseDto = new UserResponseDto(user.get().getId(), user.get().getUsername());
        return userResponseDto;
    }

}
