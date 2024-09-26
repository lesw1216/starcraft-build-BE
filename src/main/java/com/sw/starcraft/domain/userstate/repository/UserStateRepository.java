package com.sw.starcraft.domain.userstate.repository;

import com.sw.starcraft.domain.userstate.dto.UserStateDTO;

import java.util.List;

public interface UserStateRepository {

    List<UserStateDTO> findAllUserStates();

    int findUserStateIdByState(String targetState);
}
