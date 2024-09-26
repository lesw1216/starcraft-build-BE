package com.sw.starcraft.domain.userstate.repository;

import com.sw.starcraft.domain.userstate.dto.UserStateDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserStateMapper {

    List<UserStateDTO> findAllUserStates();

    int findUserStateIdByState(String targetState);
}
