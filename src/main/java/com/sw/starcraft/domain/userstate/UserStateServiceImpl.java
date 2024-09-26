package com.sw.starcraft.domain.userstate;

import com.sw.starcraft.domain.userstate.dto.UserStateDTO;
import com.sw.starcraft.domain.userstate.repository.UserStateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserStateServiceImpl {

    private final UserStateRepository userStateRepository;

    public int findUserStateId(String targetState) {
        return userStateRepository.findUserStateIdByState(targetState);
    }

    public List<UserStateDTO> findAllUserStates() {
        return userStateRepository.findAllUserStates();
    }
}
