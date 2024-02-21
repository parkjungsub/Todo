package com.sparta.todomemo.servicetest;

import com.sparta.todomemo.dto.UserRequestDto;
import com.sparta.todomemo.entity.User;
import com.sparta.todomemo.repository.UserRepository;
import com.sparta.todomemo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private UserService userService;

    @Test
    @DisplayName("저장된 데이터베이스 일치")
    @Transactional
    void UserSaveTest() {
        // given
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(1L);
        userRequestDto.setPassword("1234");
        userRequestDto.setUsername("박정섭");

        // when
        User user = userService.join(userRequestDto);

        // then
        Assertions.assertEquals(userRequestDto.getId(), user.getId());
        Assertions.assertEquals(userRequestDto.getPassword(), user.getPassword());
        Assertions.assertEquals(userRequestDto.getUsername(), user.getUsername());
    }
}
