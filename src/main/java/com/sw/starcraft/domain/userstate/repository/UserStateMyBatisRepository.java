package com.sw.starcraft.domain.userstate.repository;

import com.sw.starcraft.domain.userstate.dto.UserStateDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserStateMyBatisRepository implements UserStateRepository {

    private final UserStateMapper userStateMapper;

    @Override
    public List<UserStateDTO> findAllUserStates() {
        return userStateMapper.findAllUserStates();
    }

    @Override
    public int findUserStateIdByState(String targetState) {
        return userStateMapper.findUserStateIdByState(targetState);
    }
}
