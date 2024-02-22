package com.sparta.todomemo.servicetest;

import com.sparta.todomemo.dto.UserRequestDto;
import com.sparta.todomemo.dto.UserResponseDto;
import com.sparta.todomemo.entity.User;
import com.sparta.todomemo.repository.UserRepository;
import com.sparta.todomemo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;


    @Test
    @DisplayName("서비스 데이터 확인")
    @Transactional
    void UserSaveTest() {
        // given
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(1L);
        userRequestDto.setPassword("1234");
        userRequestDto.setUsername("박정섭");

        // when
        UserResponseDto userResponseDto = userService.join(userRequestDto);

        // then
        Assertions.assertEquals(1L, userRequestDto.getId());
        Assertions.assertEquals("박정섭", userResponseDto.getUsername());
    }
}
