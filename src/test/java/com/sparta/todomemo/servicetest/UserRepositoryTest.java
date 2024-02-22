package com.sparta.todomemo.servicetest;

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

public class UserRepositoryTest {


    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("저장된 데이터베이스 일치")
    @Transactional
    void UserSaveTest() {
        // given
//        UserRequestDto userRequestDto = new UserRequestDto();
//        userRequestDto.setId(1L);
//        userRequestDto.setPassword("1234");
//        userRequestDto.setUsername("박정섭");
        String name = "박정섭";
        String password = "1234";

        // when
        userRepository.save(new User("박정섭", "1234"));
        //  userService.join(userRequestDto);
        List<User> all = userRepository.findAll();
        // then
//        Assertions.assertEquals(null,user);
        Assertions.assertEquals(1L,all.get(0).getId());
//        Assertions.assertEquals(name,all.get(0).getUsername() );
//        Assertions.assertEquals(password, all.get(0).getPassword());
    }
}
