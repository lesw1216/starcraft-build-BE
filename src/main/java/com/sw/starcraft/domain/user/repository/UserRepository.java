package com.sw.starcraft.domain.user.repository;

import com.sw.starcraft.domain.user.UserDTO;

public interface UserRepository {

    Long save(UserDTO user);
}
