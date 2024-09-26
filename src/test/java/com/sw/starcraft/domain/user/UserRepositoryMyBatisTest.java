package com.sw.starcraft.domain.user;

import com.sw.starcraft.domain.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRepositoryMyBatisTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("회원 추가")
    void save() {
        UserDTO userDTO = UserDTO.builder()
                .email("test@abc.com")
                .password("123456")
                .userStatesId(1)
                .build();
        Long savedId = userRepository.save(userDTO);

        assertThat(savedId).isEqualTo(1L);
    }
}