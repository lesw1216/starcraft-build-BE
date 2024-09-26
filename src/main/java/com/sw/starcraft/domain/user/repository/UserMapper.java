package com.sw.starcraft.domain.user.repository;

import com.sw.starcraft.domain.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Long save(UserDTO user);
}
