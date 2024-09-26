package com.sw.starcraft.domain.userstate;

import com.sw.starcraft.domain.userstate.dto.UserStateDTO;
import com.sw.starcraft.domain.userstate.repository.UserStateRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class UserStateMyBatisRepositoryTest {

    @Autowired
    private UserStateRepository userStateRepository;

    @Test
    @DisplayName("회원 상태 목록 전체 조회")
    void findAllUserStates() {
        List<UserStateDTO> allUserStates = userStateRepository.findAllUserStates();

        assertThat(allUserStates).hasSize(5);
    }

    @Test
    @DisplayName("회원 상태 ID 조회")
    void findUserStateByState() {
        int userStateId = userStateRepository.findUserStateIdByState("ADMIN");

        assertThat(userStateId).isEqualTo(1);
    }
}